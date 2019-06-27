package Tests;

import PageObjects.Driverfactory;
import PageObjects.HomePage;
import PageObjects.SigninObject;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SignIn {
    static Driverfactory driverfactory = new Driverfactory();
    public static WebDriver driver = driverfactory.getDriver();
    HomePage homePage = new HomePage(driver);
    SigninObject signin = new SigninObject(driver);

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
    public void SignInToAccount(){
        homePage.GoToSignIn();
        signin.EnterLoginDetails("lamoghini@outlook.co.uk","Pass123");
        signin.ClickOnSignIn();
        SigninObject.SignIn message = signin.SignInSuccess();
        Assert.assertEquals("MY ACCOUNT",message.LogInSuccess());
    }









    @AfterClass
    public static void TestTearDown(){
        driver.quit();
    }
}
