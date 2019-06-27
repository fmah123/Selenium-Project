package PageObjects;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverfactory {

    static{
        ChromeDriverManager.getInstance().setup();
    }

    private WebDriver driver;


    public WebDriver getDriver(){
        if (driver == null){
            setDriver();
        }
        return driver;
    }

    private void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
