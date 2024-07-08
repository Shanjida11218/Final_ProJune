package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class config {
    public static WebDriver setupBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            System.out.println("Invalid browser type specified!");
        }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            return driver  ;


        }
    }
