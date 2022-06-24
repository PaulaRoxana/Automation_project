package page_objects;

import model.UserInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private final By usernameField = By.id("username");
    private By firstname;
    private By lastname;
    private By nickname;
    private final By emailField = By.id("email");
    private By website;
    private By passField = By.id("passw1");
    private By passField2 = By.id("passw2");
    private By registerButton = By.id("register");
    private By successMessage = By.id("wppb_form_success_message");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void register(UserInfo userInfo) {
        driver.findElement(usernameField).sendKeys(userInfo.getUsername());
        driver.findElement(firstname).sendKeys(userInfo.getFirstName());
        driver.findElement(lastname).sendKeys(userInfo.getLastName());
        driver.findElement(nickname).sendKeys(userInfo.getNickname());
        driver.findElement(emailField).sendKeys(userInfo.getEmail());
        driver.findElement(website).sendKeys(userInfo.getWebsite());
        driver.findElement(passField).sendKeys(userInfo.getPassword());
        driver.findElement(passField2).sendKeys(userInfo.getRepeatedPassword());
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void fillEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillPassword(String password){
        driver.findElement(passField).sendKeys(password);
    }

    public void fillRepeatedPassword(String password){
        driver.findElement(passField2).sendKeys(password);
    }

    public void fillPasswords(String password){
        driver.findElement(passField).sendKeys(password);
        driver.findElement(passField2).sendKeys(password);
    }

   public void clickRegister(){
      driver.findElement(registerButton).click();
    }



    public void clickOnRegisterButton(){
        driver.findElement(registerButton).click();
    }

    public String checkRegisterIsSuccessful(){
        return driver.findElement(successMessage).getText();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
