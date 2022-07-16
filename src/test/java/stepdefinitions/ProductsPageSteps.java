package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page_objects.ProductsPageContent;
import page_objects.ErrorPageAfterAbout;
import page_objects.ProductsPageMenu;

import static stepdefinitions.Hooks.driver;

public class ProductsPageSteps {
    ProductsPageMenu productsPageMenu = new ProductsPageMenu(driver);
    ProductsPageContent productsPageContent = new ProductsPageContent(driver);
    ErrorPageAfterAbout errorPageAfterAbout = new ErrorPageAfterAbout(driver);


    @Then("Check you are on Products Page")
    public void checkYouAreOnProductsPage() {
        Assert.assertEquals(productsPageContent.getCurrentURL(), driver.getCurrentUrl());

    }

    @When("Click on the menu button")
    public void clickOnTheMenuButton() {
        productsPageMenu.clickOnMenuButon();

    }

    @Then("Validate that there are four options unfolded")
    public void validateThatThereAreFourOptionsUnfolded() {
        Assert.assertEquals(4, productsPageMenu.numberOfOptionsUnfolded());

    }

    @And("Validate the names of the four options unfolded")
    public void validateTheNamesOfTheFourOptionsUnfolded() {
        productsPageMenu.checkTheNamesOfTheFourOptionsUnfolded();

        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(0).getText().equals("ALL ITEMS"));
        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(1).getText().equals("ABOUT"));
        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(2).getText().equals("LOGOUT"));
        Assert.assertTrue(productsPageMenu.getUnfoldedOptions().get(3).getText().equals("RESET APP STATE"));

    }


    @And("Click on ALL ITEMS option")
    public void clickOnALLITEMSOption() {
        productsPageMenu.clickALLITEMSOption();

    }

    @And("Click on ABOUT option")
    public void clickOnABOUTOption() {
        productsPageMenu.clickABOUTOption();
    }

    @Then("Validate that the LOGOUT option is diplayed")
    public void validateThatTheLOGOUTOptionIsDiplayed() {
        Assert.assertTrue(productsPageMenu.isTheLOGOUTOptionIsDiplayed());
    }

    @And("Click on LOGOUT option")
    public void clickOnLOGOUTOption() {
        productsPageMenu.clickLOGOUTOption();
    }

    @Then("Open an error web page")
    public void openAnErrorWebPage() {
        Assert.assertEquals(errorPageAfterAbout.getCurrentURL(), driver.getCurrentUrl());

    }
}
