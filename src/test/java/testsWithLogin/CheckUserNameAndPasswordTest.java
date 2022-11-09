package testsWithLogin;

import Methods.LoginMethods;
import Methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class CheckUserNameAndPasswordTest extends BaseTestWithLogin{

    @Test
    public void checkUserNameAndPassword(){
        LoginMethods loginMethods = new LoginMethods(driver);
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        loginMethods.navigateToPersonalInformationMethod();
        verifyMethods.checkFirstName(PropertyManager.getInstance().getFirstName());
        verifyMethods.checkLastName(PropertyManager.getInstance().getLastName());



    }


}
