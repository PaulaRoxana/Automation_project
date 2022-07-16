package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page_objects.*;

import java.time.Duration;

import static stepdefinitions.Hooks.driver;


public class ShoppingCartSteps {

    ProductsPageMenu productsPageMenu = new ProductsPageMenu(driver);
    ProductsPageContent productsPageContent = new ProductsPageContent(driver);
    ErrorPageAfterAbout errorPageAfterAbout = new ErrorPageAfterAbout(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @When("Add one product to the shopping cart")
    public void addOneProductToTheShoppingCart() {
        productsPageContent.addOneProductToCart();
    }

    @And("Click on checkout button")
    public void clickOnCheckoutButton() {
        cartPage.clickTheCheckoutButton();
    }

    @Then("You are redirected to Checkout page")
    public void youAreRedirectedToCheckoutPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        Assert.assertEquals(checkoutPage.getCheckoutPageURL(), driver.getCurrentUrl());
    }
}
