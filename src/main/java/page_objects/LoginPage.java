package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private WebDriver driver;
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessage1 = By.cssSelector("h3[data-test='error']");
    private String errorMessageForIncorrectUsernameOrPassword = "Epic sadface: Username and password do not match any user in this service";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public By getUsernameInput() {
        return usernameInput;
    }

    public By getPasswordInput() {
        return passwordInput;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    public By getErrorMessage1() {
        return errorMessage1;
    }

    public String getErrorMessageForIncorrectUsernameOrPassword() {
        return errorMessageForIncorrectUsernameOrPassword;
    }

    public void fillUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void submit() {
        driver.findElement(loginBtn).click();
    }

    public void loginWith(String username, String password){
        fillUsername(username);
        fillPassword(password);
        submit();
    }

    public String theErrorMessageForIncorrectUsernameOrPassword() {
        return driver.findElement(errorMessage1).getText();

    }
}
