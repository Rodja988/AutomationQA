package Methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationMethods extends RegistrationPage {
    public RegistrationMethods(WebDriver driver) {
        super(driver);
    }
    LoginPage loginPage = new LoginPage(driver);

    public void createNewUserMethod(String email, String fname, String lname, String password, String address,
                                    String city, String postalCode, String mobilePhone){
    loginPage.signIn();
    loginPage.registerEmail(email);
    loginPage.createAccount();
    createFirstName(fname);
    createLastName(lname);
    createPassword(password);
    createAddress(address);
    createCity(city);
    selectState();
    createPostalCode(postalCode);
    createMobilePhone(mobilePhone);
    registrationButton();
    }

}
