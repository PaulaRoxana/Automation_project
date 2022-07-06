package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private WebDriver driver;
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessage1 = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
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

    public String validateTheErrorMessage1() {
        return driver.findElement(errorMessage1).getText();

    }
}
