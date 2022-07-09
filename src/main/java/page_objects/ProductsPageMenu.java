package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageMenu {

    private WebDriver driver;
    private By menuButton = By.cssSelector("#react-burger-menu-btn");
    private By unwrappedMenuButton = By.cssSelector(".bm-item-list");

    public ProductsPageMenu(WebDriver driver) {
        this.driver=driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public By getMenuButton() {
        return menuButton;
    }

    public By getUnwrappedMenuButton() {
        return unwrappedMenuButton;
    }



}
