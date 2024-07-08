package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp extends config {

    @And("customer enter their email")
    public void customerEnterTheirEmail() {
        driver.findElement(By.xpath("//*[@id=\"sc-longRegistrationFormDefinition_email\"]")).sendKeys("xyz@gmail.com");
        
    }

    @And("customer enter their password")
    public void customerEnterTheirPassword() {
        driver.findElement(By.xpath("//*[@id=\"sc-longRegistrationFormDefinition_password\"]")).sendKeys("Abed1234");
    }

    @And("customer agrees with terms and conditions")
    public void customerAgreesWithTermsAndConditions() {
        driver.findElement(By.xpath("//*[@id=\"scRegistrationFormConfig\"]/div[2]/div/div/div/div[3]/div[2]/div")).click();

    }

    @Then("customer click on Join the Club button")
    public void customerClickOnJoinTheClubButton() {
        driver.findElement(By.xpath("//*[@id=\"scRegistrationFormConfig\"]/div[2]/div/div/div/div[3]/div[4]/div/button")).click();
    }
}
