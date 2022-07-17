package page_objects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ErrorPageAfterAbout {

    private WebDriver driver;

    private String currentURL = "https://saucelabs.com/error/404";

    public ErrorPageAfterAbout(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getCurrentURL() {
                return currentURL;
    }

   public void checkYouAreOnErrorPage() {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
}
