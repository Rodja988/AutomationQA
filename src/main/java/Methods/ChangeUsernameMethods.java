package Methods;

import org.openqa.selenium.WebDriver;
import pages.PersonalInformationPage;

public class ChangeUsernameMethods extends PersonalInformationPage {
    public ChangeUsernameMethods(WebDriver driver) {
        super(driver);
    }
    public void changeUsername(String fname, String lname, String password){
        firstNameField(fname);
        lastNameField(lname);
        passwordField(password);
        saveButton();
    }

}
