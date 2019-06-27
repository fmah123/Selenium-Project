package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void WaitAndClick(By Selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Selector));
        element.click();
    }

    public void FindAndType(By Selector, String input){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Selector));
        element.sendKeys(input);
    }
}
