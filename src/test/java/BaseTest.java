import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    public WebDriver initializeDriver(){
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return this.driver;
    }

    public void navigateToUrl(String url){
        this.driver.get(url);
    }
    public void closeDriver (){
        if(this.driver!=null) this.driver.close();
    }

    public String currentUrl(){
        return this.driver.getCurrentUrl();
    }
}
