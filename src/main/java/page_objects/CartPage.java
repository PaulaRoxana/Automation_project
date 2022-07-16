package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;
    private By checkoutButton = By.cssSelector("");



    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

   public void clickTheCheckoutButton(){

   }
}
