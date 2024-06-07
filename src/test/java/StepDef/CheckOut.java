package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOut extends config {
    @And("Customer click on the Cart icon")
    public void customerClickOnTheCartIcon() {
        driver.findElement(By.xpath("/html/body/header/div[8]/div[2]/div[2]/div[2]/a/span[2]")).click();
    }

    @And("Customer click on Checkout button")
    public void customerClickOnCheckoutButton() {
        driver.findElement(By.xpath("//*[@id=\"cartSummary\"]/div[6]/a/span/span")).click();

    }

    @And("Customer enter their First name")
    public void customerEnterTheirFirstName() {
        driver.findElement(By.xpath("//*[@id=\"checkoutAddressStepDeliveryAddressFormDefinition_firstName\"]")).sendKeys("ABC");

    }

    @And("Customer enter their Last name")
    public void customerEnterTheirLastName() {
        driver.findElement(By.xpath("//*[@id=\"checkoutAddressStepDeliveryAddressFormDefinition_lastName\"]")).sendKeys("xyz");

    }

    @And("Customer enter their Telephone Number")
    public void customerEnterTheirTelephoneNumber() {
        Select code = new Select (driver.findElement(By.cssSelector("div.selected-flag")));
        code.selectByVisibleText("United States: +1");
        driver.findElement(By.xpath("//*[@id=\"checkoutAddressStepDeliveryAddressFormDefinition_phone\"]")).sendKeys("2345678901");

    }

    @And("Customer enter the first line of their address")
    public void customerEnterTheFirstLineOfTheirAddress() {
        driver.findElement(By.xpath("//*[@id=\"us-checkoutAddressStepDeliveryAddressFormConfig\"]/div[7]/div/input")).sendKeys("1121 10th ave");

    }

    @Then("Customer click on continue Button")
    public void customerClickOnContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"swa-main\"]/div[3]/div[1]/div[3]/button/span/span")).click();
    }
}
