package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products extends BasePage{
    public Products(WebDriver driver) {
        super(driver);
    }


    private By lblProductLocator = By.cssSelector("div #header_container span.title");


    public WebElement lblProduct = driver.findElement(lblProductLocator);

}
