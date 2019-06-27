package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninObject extends BasePage {
    private static WebDriver driver;

    public SigninObject(WebDriver driver){
        super(driver);
        SigninObject.driver = driver;
    }

    private final By Email_Entry_Box = By.cssSelector("div.form-group input[id=email]");
    private final By Password_Entry_Box = By.cssSelector("span input[id=passwd]");
    private final By Sign_In_Button = By.cssSelector("button#SubmitLogin span");

    public void EnterLoginDetails(String User, String Password){
        FindAndType(Email_Entry_Box, User);
        FindAndType(Password_Entry_Box, Password);
    }

    public void ClickOnSignIn(){
        WaitAndClick(Sign_In_Button);
    }

    public  SignIn SignInSuccess(){
        return new SignIn(driver.findElement(By.cssSelector("div.columns-container div#columns")));
    }


    public class SignIn{

        public SignIn(WebElement element){
            this.element = element;
        }

        private final WebElement element;

        private final By Success_Msg_Login = By.cssSelector("div#center_column h1.page-heading");


        public String LogInSuccess(){
            return element.findElement(Success_Msg_Login).getText().trim();
        }


     }


}
