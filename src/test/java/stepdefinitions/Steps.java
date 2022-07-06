package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.Application;
import page_objects.LoginPage;

import static stepdefinitions.Hooks.driver;

public class Steps {

        public LoginPage loginPage;

        @Given("Open the Saucedemo web page")
        public void openTheSaucedemoWebPage() {
                LoginPage loginPage = new Application(driver).navigateToLoginPage();
        }

        @When("Fill the Username field with correct username {string}")
        public void fillTheUsernameFieldWithCorrectUsername(String text) {
                loginPage.fillUsername(text);

        }

        @And("Fill the Password field with correct password {string}")
        public void fillThePasswordFieldWithCorrectPassword(String text) {
                loginPage.fillPassword(text);
        }

        @And("Click on LOGIN button")
        public void clickOnLOGINButton() {
                loginPage.submit();
        }

        @Then("Open the Products page")
        public void openTheProductsPage() {


        }
}
