package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
    private WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoutButtonDisplayed() {
        WebElement logOutBtn = driver.findElement(By.id("menu-item-126"));
        return logOutBtn.isDisplayed();
    }
}
