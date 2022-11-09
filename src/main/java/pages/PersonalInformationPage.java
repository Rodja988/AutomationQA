package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInformationPage extends BasePage{
    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }
    By firstNameInputFieldBy = By.id("firstname");
    By lastNameInputFieldBy = By.id("lastname");
    By passwordInputFieldBy = By.id("old_passwd");
    By saveButtonBy = By.name("submitIdentity");
    By successMessageBy = By.xpath("//*[@id=\"center_column\"]/div/p");

    public void firstNameField(String fname){
        writeText(firstNameInputFieldBy, fname);
    }
    public void lastNameField(String lname){
        writeText(lastNameInputFieldBy, lname);
    }
    public void passwordField(String password){
        writeText(passwordInputFieldBy, password);
    }
    public void saveButton(){
        clickElement(saveButtonBy);
    }
    public String readingTextFromSuccessfulChange(){
        return readText(successMessageBy);
    }
    public void readingTextFromFirstNameField(String firstName){
        assertStringEquals(readAttribute(firstNameInputFieldBy, "value"), firstName);
    }
    public void readingTextFromLastNameField(String lastName){
        assertStringEquals(readAttribute(lastNameInputFieldBy, "value"), lastName);
    }

   /* public void changeUsername(String fname, String lname, String password){
        writeText(firstNameInputFieldBy, fname);
        writeText(lastNameInputFieldBy, lname);
        writeText(passwordInputFieldBy, password);
        clickElement(saveButtonBy);
    }*/
    /*public void verifyUsernameChange(String expectedText){
        assertStringEquals(readText(successMessageBy), expectedText);
    }*/

}
