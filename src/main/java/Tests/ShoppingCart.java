package Tests;

import PageObjects.Driverfactory;
import PageObjects.HomePage;
import PageObjects.ShoppingCartObject;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class ShoppingCart {

    static Driverfactory driverfactory = new Driverfactory();
    public static WebDriver driver = driverfactory.getDriver();
    HomePage homePage = new HomePage(driver);
    ShoppingCartObject shoppingcart = new ShoppingCartObject(driver);

    @BeforeClass
    public static void TestSetUp(){
        driverfactory.getDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Before
    public void IndividualSetUp(){
        homePage.GoToHomePage();
    }

    @Test
    public void ViewAnItem(){
        homePage.GoToSignIn();

    }









    @AfterClass
    public static void TestTearDown(){
        driver.quit();
    }



}
