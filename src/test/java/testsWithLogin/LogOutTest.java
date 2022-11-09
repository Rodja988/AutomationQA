package testsWithLogin;

import Methods.LoginMethods;
import Methods.VerifyMethods;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTestWithLogin{

    @Test
    public void logOutTest(){
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.logOutMethod();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyLogOut("Sign in");

    }
}
