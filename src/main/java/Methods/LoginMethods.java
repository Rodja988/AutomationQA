package Methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.UserLoggedInPage;

public class LoginMethods extends LoginPage {
    public LoginMethods(WebDriver driver) {
        super(driver);
    }
    UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);

    public void loginMethod(String email, String password){
        clickSignInButton();
        signInEmailAddressField(email);
        signInPasswordField(password);
        clickLoginButton();
    }
    public void logOutMethod(){
        clickLogout();
    }
    public void navigateToPersonalInformationMethod(){
        userLoggedInPage.navigateToPersonalInformation();
    }

}
