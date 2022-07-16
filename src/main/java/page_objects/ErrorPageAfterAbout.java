package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

}
