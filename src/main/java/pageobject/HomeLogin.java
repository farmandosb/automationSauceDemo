package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeLogin extends BasePage{
    public HomeLogin(WebDriver driver) {
        super(driver);
    }

    private By inputUsernameLocator = By.id("user-name");
    private By inputPasswordLocator = By.id("password");
    private By btnLoginLocator = By.id("login-button");


    public WebElement inputUsername = driver.findElement(inputUsernameLocator);
    public WebElement inputPassword = driver.findElement(inputPasswordLocator);
    public WebElement btnLogin = driver.findElement(btnLoginLocator);


    public void login(String username, String password){
        inputUsername.sendKeys("standard_user");
        inputPassword.sendKeys("secret_sauce");
        btnLogin.click();
    }
}
