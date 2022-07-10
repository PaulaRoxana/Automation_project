package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageContent {


    private WebDriver driver;
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessageElement= By.cssSelector("h3[data-test='error']");
    private String errorMessageForIncorrectUsernameOrPassword = "Epic sadface: Username and password do not match any user in this service";
    private String errorMessageForMissingUsername = "Epic sadface: Username is required";
    private String errorMessageForMissingPassword = "Epic sadface: Password is required";

    public ProductsPageContent(WebDriver driver) {
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
        return errorMessageElement;
    }

    public String getErrorMessageForIncorrectUsernameOrPassword() {
        return errorMessageForIncorrectUsernameOrPassword;
    }

    public String getErrorMessageForMissingUsername() {
        return errorMessageForMissingUsername;
    }

    public String getErrorMessageForMissingPassword() {
        return errorMessageForMissingPassword;
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



}
