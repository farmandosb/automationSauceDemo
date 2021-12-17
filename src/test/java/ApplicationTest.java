import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ApplicationTest {
    @Test
    public void test01() throws InterruptedException {
        Assert.assertEquals(Application.greeting,"Hello world");
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        //driver.close();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement inputUsername = driver.findElement(By.id("user-name"));
        WebElement inputUsername = driver.findElement(By.id("user-name"));
        inputUsername.clear();
        inputUsername.sendKeys("standard_user");

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.clear();
        inputPassword.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
        Thread.sleep(2000);
        driver.close();
    }
}
