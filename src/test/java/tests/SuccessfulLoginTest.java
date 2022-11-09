package tests;

import Methods.LoginMethods;
import Methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class SuccessfulLoginTest extends BaseTest{

    @Test
    public void successfulLogin(){
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginMethod(PropertyManager.getInstance().getGoodEmail(),
                                 PropertyManager.getInstance().getGoodPassword());
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifySignIn("Sign out");
    }
}
