package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageHeader {

    private WebDriver driver;
    private By productsElement = By.cssSelector(".title");

    public ProductsPageHeader(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public By getProductsElement() {
        return productsElement;
    }

    public boolean isProductsElementDisplayed() {
        return driver.findElement(productsElement).isDisplayed();
    }
}
