package testsWithLogin;

import Methods.ChangeUsernameMethods;
import Methods.LoginMethods;
import Methods.VerifyMethods;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import dataGenerator.DataCreation;
import org.testng.annotations.Test;
import pages.PersonalInformationPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class ChangeUsernameTest extends BaseTestWithLogin{

    @Test
    public void changeInformation(){
        LoginMethods loginMethods = new LoginMethods(driver);
        ChangeUsernameMethods changeUsernameMethods = new ChangeUsernameMethods(driver);
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        String fname = DataCreation.generateFirstName();
        String lname = DataCreation.generateLastName();
        loginMethods.navigateToPersonalInformationMethod();
        changeUsernameMethods.changeUsername(fname, lname, PropertyManager.getInstance().getGoodPassword());
        try{
            verifyMethods.verifySuccessfulUsernameChange("Your personal information has been successfully updated.");
            PropertyManager.changeProperty("firstName", fname);
            PropertyManager.changeProperty("lastName", lname);
        }catch (Exception e){
            e.printStackTrace();
        }


       /* UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToPersonalInformation();
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        String fname = DataCreation.generateFirstName();
        String lname = DataCreation.generateLastName();
        personalInformationPage.changeUsername(fname, lname, PropertyManager.getInstance().getGoodPassword());
        try {
            personalInformationPage.verifyUsernameChange("Your personal information has been successfully updated.");
            PropertyManager.changeProperty("firstName", fname);
            PropertyManager.changeProperty("lastName", lname);
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }
}
