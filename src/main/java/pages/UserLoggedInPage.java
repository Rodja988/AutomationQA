package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{


    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }
    By signOutButtonBy = By.className("logout");
    By personalInformationButtonBy = By.className("icon-user");

    public void navigateToPersonalInformation(){
        clickElement(personalInformationButtonBy);
    }
    /*public void verifySuccessfulLogin(String expectedText){
        String verify = readText(signOutButtonBy);
        assertStringEquals(verify, expectedText);
    }*/

}
