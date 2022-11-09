package tests;

import Methods.RegistrationMethods;
import Methods.VerifyMethods;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import dataGenerator.DataCreation;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest{

    @Test
    public void registrationTest(){
        RegistrationMethods registrationMethods = new RegistrationMethods(driver);
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        String email = DataCreation.generateEmail();
        String password = DataCreation.generatePassword();
        registrationMethods.createNewUserMethod(email, DataCreation.generateFirstName(), DataCreation.generateLastName(),
                                                password, DataCreation.generateAddress(), DataCreation.generateCity(),
                                                DataCreation.generatePostalCode(), DataCreation.generateMobilePhone());
        try {
            verifyMethods.verifyRegistration("Sign out");
            PropertyManager.changeProperty("goodEmail", email);
            PropertyManager.changeProperty("goodPassword", password);
        } catch (Exception e){
            e.printStackTrace();
        }



        /*LoginPage signIn = new LoginPage(driver);
        signIn.signIn();
        RegistrationPage registration = new RegistrationPage(driver);
        signIn.registerEmail(DataCreation.generateEmail());
        signIn.createAccount();

        String email = DataCreation.generateEmail();
        String password = DataCreation.generatePassword();

        registration.createFirstName(DataCreation.generateFirstName());
        registration.createLastName(DataCreation.generateLastName());
        registration.createPassword(password);
        registration.createAddress(DataCreation.generateAddress());
        registration.createCity(DataCreation.generateCity());
        registration.selectState();
        registration.createPostalCode(DataCreation.generatePostalCode());
        registration.createMobilePhone(DataCreation.generateMobilePhone());
        registration.registrationButton();
        try {
            registration("Sign out");
            PropertyManager.changeProperty("goodEmail", email);
            PropertyManager.changeProperty("goodPassword", password);
        }catch (Exception e){
            e.printStackTrace();
        }*/


    }

}
