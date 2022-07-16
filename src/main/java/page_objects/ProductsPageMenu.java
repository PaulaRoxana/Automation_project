package page_objects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPageMenu {

    private WebDriver driver;
    private By menuButton = By.cssSelector("#react-burger-menu-btn");
    private By unwrappedMenu = By.cssSelector(".bm-item.menu-item");
    private By logoutOption = By.cssSelector("#logout_sidebar_link");
    private By allItemsOption = By.cssSelector("#logout_sidebar_link");


    public ProductsPageMenu(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public By getMenuButton() {
        return menuButton;
    }

    public By getUnwrappedMenuButton() {
        return unwrappedMenu;
    }

    public List<WebElement> getUnfoldedOptions() {
        return driver.findElements(unwrappedMenu);
    }

   // public void explicitWaitForTheMenuButtonToAppear() {

   //     driver.get("https://www.saucedemo.com/inventory.html");
     //   driver.findElement(menuButton).click();
     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //    WebElement finish = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuButton)));


   // }

    public void clickOnMenuButon() {
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(menuButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement finish = wait.until(ExpectedConditions.visibilityOf(driver.findElement(menuButton)));
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(menuButton)).click().build().perform();
    }

    public int numberOfOptionsUnfolded() {
        return getUnfoldedOptions().size();

    }

    public void checkTheNamesOfTheFourOptionsUnfolded() {
        for (int i = 0; i < numberOfOptionsUnfolded(); i++) {
            System.out.println(getUnfoldedOptions().get(i).getText());
        }
    }

    public boolean isTheLOGOUTOptionIsDiplayed(){
        return driver.findElement(logoutOption).isDisplayed();
    }

    public void clickALLITEMSOption(){Actions builder = new Actions(driver);
       // builder.moveToElement(driver.findElement(menuButton)).click().build().perform();

        driver.findElement(allItemsOption).click();
    }

    public void clickABOUTOption(){

    }

}
