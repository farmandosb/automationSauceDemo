import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.HomeLogin;

public class LoginTest extends BaseTest{
    WebDriver driver;
    public HomeLogin home;

    @BeforeTest
    public void preconditions() throws InterruptedException {
        this.driver = this.initializeDriver();
        this.navigateToUrl("https://www.saucedemo.com/");
        Thread.sleep(2000);
        home = new HomeLogin(this.initializeDriver());
    }
    @Test
    public void LoginStandardUser(){

        this.home.inputUsername.sendKeys("standard_user");
        this.home.inputPassword.sendKeys("secret_sauce");
        this.home.btnLogin.click();
        Assert.assertEquals(this.currentUrl(),"https://www.saucedemo.com/inventory.html");

    }
    @AfterTest
    public void cleanUp(){
        this.closeDriver();
    }
}
