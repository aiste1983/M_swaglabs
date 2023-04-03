import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class Swaglab {
    public WebDriver driver;

    @Test
    public void login()throws InterruptedException{
        driver.get("http://www.saucedemo.com/");
        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement button= driver.findElement(By.id("login-button"));
        button.click();
        WebElement button1=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        button1.click();
        WebElement button2= driver.findElement(By.id("shopping_cart_container"));
        button2.click();
        WebElement checkout=driver.findElement(By.id("checkout"));
        checkout.click();
        WebElement name = driver.findElement(By.id("first-name"));
        name.sendKeys("name");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("lastname");
        WebElement postalcode= driver.findElement(By.id("postal-code"));
        postalcode.sendKeys("postal code");
        WebElement tab = driver.findElement(By.id("continue"));
        tab.click();
        WebElement finish = driver.findElement(By.id( "finish"));
        finish.click();


    }

    @Test
    public void pageLoads() {
        driver.get("https://www.saucedemo.com");

    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @AfterClass
    public void afterClass() {
//        driver.quit();
    }

}