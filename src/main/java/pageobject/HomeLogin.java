package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeLogin extends BasePage{
    private WebDriver driver;

    public HomeLogin(WebDriver driver) {
        super(driver);
    }

    private By inputUsernameLocator = By.id("user-name");
    private By inputPasswordLocator = By.id("password");
    private By btnLoginLocator = By.id("login-button");

    public WebElement inputUsername = this.driver.findElement(inputUsernameLocator);
    public WebElement inputPassword = this.driver.findElement(inputPasswordLocator);
    public WebElement btnLogin = this.driver.findElement(btnLoginLocator);
}
