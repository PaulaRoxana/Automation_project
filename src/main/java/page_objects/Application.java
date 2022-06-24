package page_objects;

import org.openqa.selenium.WebDriver;

public class Application {

    public WebDriver driver;

    public Application(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateToLoginPage() {
        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/login/");
        return new LoginPage(driver);
    }

    public RegisterPage navigateToRegisterPage() {
        driver.get("https://testare-manuala.locdejoacapentruitsti.com/blog/register/");
        return new RegisterPage(driver);
    }
}



