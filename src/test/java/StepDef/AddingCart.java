package StepDef;

import Base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class AddingCart extends config {
    @And("Customer navigate to Jewelry button")
    public void customerNavigateToJewelryButton() {
        driver.findElement(By.xpath("//*[@id=\"NAV-BAR_JEWELRY_LINK\"]/span")).click();

    }

    @And("Customer click on their desired product")
    public void customerClickOnTheirDesiredProduct() {
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[4]/div/a/div[1]")).click();

    }

    @Then("Customer click on Add To cart button")
    public void customerClickOnAddToCartButton() {
        driver.findElement(By.xpath("//*[@id=\"addToCartButton\"]/span/span")).click();
    }
}
