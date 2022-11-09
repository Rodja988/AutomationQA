package Methods;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.PersonalInformationPage;
import pages.RegistrationPage;

public class VerifyMethods extends BasePage {
    public VerifyMethods(WebDriver driver) {
        super(driver);
    }
    LoginPage loginPage = new LoginPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);
    PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
    public void verifySignIn(String expectedText){
        assertStringEquals(loginPage.readingTextFromSignOutButton(), expectedText);
    }
    public void verifyFailedLogin(String expectedText){
        assertStringEquals(loginPage.readingTextFromErrorField(), expectedText);
    }
    public void verifyLogOut(String expectedText){
        assertStringEquals(loginPage.readingTextFromSignInButton(), expectedText);
    }
    public void verifyRegistration(String expectedText){
        assertStringEquals(registrationPage.readingTextFromSignOutNotification(), expectedText);
    }
    public void verifySuccessfulUsernameChange(String expectedText){
        assertStringEquals(personalInformationPage.readingTextFromSuccessfulChange(), expectedText);
    }
    public void checkFirstName(String firstName){
        personalInformationPage.readingTextFromFirstNameField(firstName);
    }
    public void checkLastName(String lastName){
        personalInformationPage.readingTextFromLastNameField(lastName);
    }
}
