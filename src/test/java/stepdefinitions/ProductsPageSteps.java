package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page_objects.Application;
import page_objects.LoginPage;
import page_objects.ProductsPageMenu;

import static stepdefinitions.Hooks.driver;

public class ProductsPageSteps {
    LoginPage loginPage;
    ProductsPageMenu productsPage;


    @And("Click on the menu buton")
    public void clickOnTheMenuButon() {
        productsPage.clickOnMenuButon();

    }

    @Then("Validate that there are four options unfolded")
    public void validateThatThereAreFourOptionsUnfolded() {
        Assert.assertEquals(4, productsPage.checkTheNumberOfOptionsUnfolded());

    }

    @And("Validate the names of the four options unfolded")
    public void validateTheNamesOfTheFourOptionsUnfolded() {
        productsPage.checkTheNamesOfTheFourOptionsUnfolded();

        Assert.assertTrue(productsPage.unfoldedOptions.get(0).getText().equals("ALL ITEMS"));
        Assert.assertTrue(unfoldedOptions.get(1).getText().equals("ABOUT"));
        Assert.assertTrue(unfoldedOptions.get(2).getText().equals("LOGOUT"));
        Assert.assertTrue(unfoldedOptions.get(3).getText().equals("RESET APP STATE"));

    }
}
