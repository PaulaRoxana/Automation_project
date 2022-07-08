package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseTestClass;

import java.util.List;

public class Testing extends BaseTestClass {

    @Test
    public void clickOnTheMenuButton() {

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("#password"));
        loginButton.submit();

        WebElement menuButton = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
        Actions builder = new Actions(driver);
        builder.moveToElement(menuButton).click().build().perform();


        WebElement unwrappedMenuButton = driver.findElement(By.cssSelector(".bm-item-list"));
        List<WebElement> unwrappedOptions = driver.findElements(By.cssSelector("a[class^='bm-item']"));
        Assert.assertTrue(unwrappedOptions.size() == 4);


        for (int i = 0; i < unwrappedOptions.size(); i++) {
            System.out.println(unwrappedOptions.get(i).getText());
        }


        Assert.assertTrue(unwrappedOptions.get(0).getText().equals("ALL ITEMS"));
        Assert.assertTrue(unwrappedOptions.get(1).getText().equals("ABOUT"));
        Assert.assertTrue(unwrappedOptions.get(2).getText().equals("LOGOUT"));
        Assert.assertTrue(unwrappedOptions.get(3).getText().equals("RESET APP STATE"));

        System.out.println(driver.findElement(By.id("inventory_sidebar_link")).getText());
    }

}
