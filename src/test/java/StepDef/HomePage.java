package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomePage extends config {

    @Given("customer at Swarovski Homepage")
    public void customerAtSwarovskiHomepage() {
        driver = new ChromeDriver();
        driver.get("https://www.swarovski.com/en-US/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @And("customer clicks on Register button")
    public void customerClicksOnRegisterButton() {
        driver.findElement(By.xpath("/html/body/header/div[6]/div[3]/div[3]/a/span")).click();
    }

}
