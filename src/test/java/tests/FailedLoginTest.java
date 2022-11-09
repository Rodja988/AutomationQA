package tests;

import Methods.LoginMethods;
import Methods.VerifyMethods;
import dataGenerator.DataProviders;
import org.testng.annotations.Test;

public class FailedLoginTest extends BaseTest {

    @Test(dataProvider = "failedLogin", dataProviderClass = DataProviders.class)
    public void failedLogin(String email, String password, String error) {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginMethod(email, password);
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyFailedLogin(error);

    }

}

