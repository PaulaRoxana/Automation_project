package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private WebDriver driver;
    private String checkoutpageURL = "https://www.saucedemo.com/checkout-step-one.html";

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getCheckoutpageURL() {
        return checkoutpageURL;
    }
}
