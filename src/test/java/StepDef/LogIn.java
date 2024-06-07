package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class LogIn extends config {
    @And("customer clicks on Login button")
    public void customerClicksOnLoginButton() {
        driver.findElement(By.xpath("/html/body/header/div[6]/div[3]/div[2]/a/span[2]")).click();
    }

    @Then("customer click on login button")
    public void customerClickOnLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"sacLoginForm\"]/div[2]/div[4]/button")).click();
    }
}
