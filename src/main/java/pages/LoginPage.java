package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By signInButtonBy = By.className("login");
    By emailFieldBy = By.id("email");
    By passwordFieldBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");
    By errorNotificationBy = By.xpath("//*[@id=\"center_column\"]/div[1]");
    By signOutButtonBy = By.className("logout");
    By signOutNotificationBy = By.className("login");
    By createEmailFieldBy = By.id("email_create");
    By createAccountButtonBy = By.id("SubmitCreate");


    public void clickSignInButton(){
        clickElement(signInButtonBy);
    }
    public void signInEmailAddressField(String email){
        writeText(emailFieldBy, email);
    }
    public void signInPasswordField(String password){
        writeText(passwordFieldBy, password);
    }
    public void clickLoginButton(){
        clickElement(loginButtonBy);
    }
    public String readingTextFromSignOutButton(){
        return readText(signOutButtonBy);
    }
    public String readingTextFromErrorField(){
        return readText(errorNotificationBy);
    }
    public void clickLogout(){
        clickElement(signOutButtonBy);
    }
    public String readingTextFromSignInButton(){
        return readText(signInButtonBy);
    }
    public void signIn(){
        clickElement(signInButtonBy);
    }
    public void registerEmail(String email){
        writeText(createEmailFieldBy, email);
    }
    public void createAccount(){
        clickElement(createAccountButtonBy);
    }


    /*public void login (String email, String password){
        clickElement(signInButtonBy);
        writeText(emailFieldBy,email);
        writeText(passwordFieldBy,password);
        clickElement(loginButtonBy);
    }*/
  /*  public void verifyFailedLogin(String expectedText){
        String error = readText(errorNotificationBy);
        assertStringEquals(error, expectedText);
    }*/

    /*public void verifySignOut(String expectedText){
        String passed = readText(signOutNotificationBy);
        assertStringEquals(passed, expectedText);
    }*/

}
