package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageMenu {

    private WebDriver driver;
    private By menuButton = By.id("react-burger-menu-btn");


    public ProductsPageMenu(WebDriver driver) {
        this.driver=driver;
    }


}
