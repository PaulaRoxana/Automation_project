package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageContent {


    private WebDriver driver;
     private String currentURL = "https://www.saucedemo.com/inventory.html";
     private By shoppingCartButton =  By.cssSelector("#shopping_cart_container");

     private By addBackpackToCart= By.cssSelector("add-to-cart-sauce-labs-backpack");


    public ProductsPageContent(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getCurrentURL() {
        return currentURL;
    }

    public By getShoppingCartButton() {
        return shoppingCartButton;
    }

    public By getAddBackpackToCart() {
        return addBackpackToCart;
    }

    public void clickTheShoppingCartButton(){
        driver.findElement(shoppingCartButton).click();
    }

    public void addOneProductToCart(){
        driver.findElement(addBackpackToCart).click();
    }
}
