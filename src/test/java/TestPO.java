import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.HomeLogin;
import pageobject.Products;

import java.util.Locale;

public class TestPO extends BaseTest {
    WebDriver driver;
    HomeLogin homeLogin;

    @BeforeTest
    public void setUp() {
        this.driver = initializeDriver();
        navigateToUrl("https://www.saucedemo.com/");
        this.homeLogin = new HomeLogin(driver);
    }

    @Test
    public void test01() {
        homeLogin.login("standard_user","secret_sauce");
        Products products = new Products(driver);
        Assert.assertEquals(products.lblProduct.getText().toLowerCase(Locale.ROOT),"products");

    }

    @AfterTest
    public void cleanUp(){
        closeDriver();
    }

}
