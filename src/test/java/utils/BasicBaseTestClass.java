package utils;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Deprecated
public class BasicBaseTestClass {

    protected WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/utils/chromedriver");
    }

    @Before
    public void setupDriver() {
        driver = new ChromeDriver();
    }

    @After
    public void cleanup() {
        driver.quit();
    }
}
