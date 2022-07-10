package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import page_objects.LoginPage;
import page_objects.ProductsPageHeader;
import page_objects.ProductsPageMenu;

import static stepdefinitions.Hooks.driver;

public class ProductsPageSteps {
    ProductsPageMenu productsPageMenu;
    ProductsPageHeader productsPageHeader;

    @Then("Validate that PRODUCTS element is displayed")
    public void validateThatProductsElementIsDisplayed() {
       Assert.assertTrue(productsPageHeader.isProductsElementDisplayed());

    }

    @And("Click on the menu buton")
    public void clickOnTheMenuButon() {
        productsPageMenu.clickOnMenuButon();

    }

    @Then("Validate that there are four options unfolded")
    public void validateThatThereAreFourOptionsUnfolded() {
        Assert.assertEquals(4, productsPageMenu.checkTheNumberOfOptionsUnfolded());

    }

    @And("Validate the names of the four options unfolded")
    public void validateTheNamesOfTheFourOptionsUnfolded() {
        productsPageMenu.checkTheNamesOfTheFourOptionsUnfolded();

        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(0).getText().equals("ALL ITEMS"));
        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(1).getText().equals("ABOUT"));
        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(2).getText().equals("LOGOUT"));
        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(3).getText().equals("RESET APP STATE"));

    }


    @Then("Validate you are logged in")
    public void validateYouAreLoggedIn() {


    }

}
