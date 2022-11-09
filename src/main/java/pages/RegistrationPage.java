package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By customerFirstNameBy = By.id("customer_firstname");
    By customerLastNameBy = By.id("customer_lastname");
    By customerPasswordBy = By.id("passwd");
    By customerAddressBy = By.id("address1");
    By customerCityBy = By.id("city");
    By customerStateBy = By.id("id_state");
    By customerPostalCodeBy = By.id("postcode");
    By customerMobilePhoneBy = By.id("phone_mobile");
    By registerAccountBy = By.id("submitAccount");
    By signOutNotificationBy = By.className("logout");


    public void createFirstName(String fname){
        writeText(customerFirstNameBy, fname);
    }
    public void createLastName(String lname){
        writeText(customerLastNameBy, lname);
    }
    public void createPassword(String password){
        writeText(customerPasswordBy, password);
    }
    public void createAddress(String address){
        writeText(customerAddressBy, address);
    }
    public void createCity(String city){
        writeText(customerCityBy, city);
    }
    public void selectState(){
        selectDropDown(customerStateBy, 1);
    }
    public void createPostalCode(String postalCode){
        writeText(customerPostalCodeBy, postalCode);
    }
    public void createMobilePhone(String mobilePhone){
        writeText(customerMobilePhoneBy, mobilePhone);
    }
    public void registrationButton(){
        clickElement(registerAccountBy);
    }
    public String readingTextFromSignOutNotification(){
        return readText(signOutNotificationBy);
    }
   /* public void verifyRegistration(String expectedText) {
        String passed = readText(signOutNotificationBy);
        assertStringEquals(passed, expectedText);
    }*/
}
