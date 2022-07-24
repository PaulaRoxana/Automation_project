package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page_objects.Application;
import page_objects.LoginPage;
import page_objects.ProductsPage;

import static stepdefinitions.Hooks.driver;

public class LoginSteps {
    LoginPage loginPage;
    ProductsPageMenu productsPageMenu;
    ProductsPage productsPageContent;

    @Given("Open the Saucedemo web page")
    public void openTheSaucedemoWebPage() {
        loginPage = new Application(driver).navigateToLoginPage();
    }
    @When("Fill the Username field with username {string}")
    public void fillTheUsernameFieldWithCorrectUsername(String text) {
        loginPage.fillUsername(text);

    }
    @And("Fill the Password field with password {string}")
    public void fillThePasswordFieldWithCorrectPassword(String text) {
        loginPage.fillPassword(text);
    }

    @And("Click on LOGIN button")
    public void clickOnLOGINButton() {
        loginPage.submit();
    }

     @Then("Validate the error message for incorrect Username and or Password is correct")
    public void validateTheErrorMessageForIncorrectUsernameAndOrPasswordIsCorrect() {

        Assert.assertTrue(loginPage.getErrorMessageForIncorrectUsernameOrPassword()
                .contains("Epic sadface: Username and password do not match any user in this service"));
    }

    @Then("Validate the error message for missing Username is correct")
    public void validateTheErrorMessageForMissingUsernameIsCorrect() {

        Assert.assertTrue(loginPage.getErrorMessageForMissingUsername().contains("Epic sadface: Username is required"));
    }
    @Then("Validate the error message for missing Password is correct")
    public void validateTheErrorMessageForMissingPasswordIsCorrect() {
        Assert.assertTrue(loginPage.getErrorMessageForMissingPassword().contains("Epic sadface: Password is required"));
    }


}