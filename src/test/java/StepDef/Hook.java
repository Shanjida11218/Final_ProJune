package StepDef;

import Base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends config {
    public static String baseURL;
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        if (Strings.isNullOrEmpty(envType)){
            envType = "qa";
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType = "chrome";
        }
        driver = setupBrowser(browserType);
        if (envType.equals("qa")) {
            baseURL = "https://www.swarovski.com/en-US/";
        }
        driver.get(baseURL);
    }

    @After
    public void afterEachScenario(Scenario scenario){
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }driver.close();
        driver.quit();
    }
}
