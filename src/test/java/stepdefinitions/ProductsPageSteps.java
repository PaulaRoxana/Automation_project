package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page_objects.ProductsPage;
import page_objects.ErrorPageAfterAbout;

import java.time.Duration;

import static stepdefinitions.Hooks.driver;

public class ProductsPageSteps {
    ProductsPage productsPage = new ProductsPage(driver);
    ErrorPageAfterAbout errorPageAfterAbout = new ErrorPageAfterAbout(driver);

    @Then("Check you are on Products Page")
    public void checkYouAreOnProductsPage() {
        Assert.assertEquals(productsPage.getCurrentURL(), driver.getCurrentUrl());
    }
    @When("Click on the menu button")
    public void clickOnTheMenuButton() {
        productsPage.clickOnMenuButon();
    }
    @Then("Validate that there are four options unfolded")
    public void validateThatThereAreFourOptionsUnfolded() {
        Assert.assertEquals(4, productsPage.numberOfOptionsUnfolded());
    }
    @And("Validate the names of the four options unfolded")
    public void validateTheNamesOfTheFourOptionsUnfolded() {
        productsPage.checkTheNamesOfTheFourOptionsUnfolded();

        Assert.assertEquals("ALL ITEMS", productsPage.getUnfoldedOptions().get(0).getText());
        Assert.assertEquals("ABOUT", productsPage.getUnfoldedOptions().get(1).getText());
        Assert.assertEquals("LOGOUT", productsPage.getUnfoldedOptions().get(2).getText());
        Assert.assertEquals("RESET APP STATE", productsPage.getUnfoldedOptions().get(3).getText());
    }
    @And("Click on ALL ITEMS option")
    public void clickOnALLITEMSOption() {
        productsPage.clickALLITEMSOption();
    }
    @And("Click on ABOUT option")
    public void clickOnABOUTOption() {
        productsPage.clickABOUTOption();
    }
    @Then("Validate that the LOGOUT option is diplayed")
    public void validateThatTheLOGOUTOptionIsDiplayed() {
        Assert.assertTrue(productsPage.isTheLOGOUTOptionIsDiplayed());
    }
    @And("Click on LOGOUT option")
    public void clickOnLOGOUTOption() {
        productsPage.clickLOGOUTOption();
    }
    @Then("Check you are on an error page")
    public void checkYouAreOnAnErrorPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(errorPageAfterAbout.getCurrentURL(), driver.getCurrentUrl());
    }
    @And("Click on RESET APP STATE option")
    public void clickOnRESETAPPSTATEOption() {
        productsPage.clickRESETAPPSTATEOption();
    }
    @And("Click on shopping cart button")
    public void clickOnShoppingCartButton() {
        productsPage.clickTheShoppingCartButton();
    }

}
