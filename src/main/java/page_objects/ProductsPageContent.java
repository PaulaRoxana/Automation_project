package page_objects;

import org.openqa.selenium.WebDriver;

public class ProductsPageContent {


    private WebDriver driver;
     private String currentURL = "https://www.saucedemo.com/inventory.html";


    public ProductsPageContent(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getCurrentURL() {
        return currentURL;
    }
}
