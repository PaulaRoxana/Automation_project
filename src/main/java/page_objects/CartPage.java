package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {
    private WebDriver driver;
    private By checkoutButton = By.id("checkout");
    private By cartQuantityOfAddedProducts = By.cssSelector(".cart_quantity");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
    public By getCheckoutButton() {
        return checkoutButton;
    }
    public By getCartQuantityOfAddedProducts() {
        return cartQuantityOfAddedProducts;
    }
    public void clickTheCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    public int cartContainsTheNumberOfProductsAdded(){
        List<WebElement> addedProducts = driver.findElements(cartQuantityOfAddedProducts);
        return addedProducts.size();
    }
    public boolean IsEmptyCart(){
        return driver.findElement(cartQuantityOfAddedProducts).isDisplayed();
    }
    public boolean checkoutButtonNotActiveWhenIsEmptyCart() {
   return IsEmptyCart() != driver.findElement(checkoutButton).isDisplayed();

    }

}
