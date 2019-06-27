package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    private static String url = "http://automationpractice.com/index.php";
    private final By Home_Sign_In = By.cssSelector("div.header_user_info a.login");

    public void GoToHomePage(){
        driver.get(url);
    }

    public void GoToSignIn(){
        WaitAndClick(Home_Sign_In);
    }



}
