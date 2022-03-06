package co.com.choucair.certification.retot.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterUtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the registration form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRSTNAME =Target.the("Register first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME =Target.the("Register last name")
      .located(By.id("lastName"));
    public static final Target INPUT_EMAIL =Target.the("Register of email")
      .located(By.id("email"));
    public static final Target SELECT_MONTH =Target.the("Register the month of birth")
      .located(By.id("birthMonth"));
    public static final Target SELECT_DAY =Target.the("Register the day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR =Target.the("Register the year of birth")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION =Target.the("Button to go to the location page")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY =Target.the("Register the city where you live")
            .located(By.id("city"));
    public static final Target INPUT_ZIP =Target.the("Enter the postal code of the city where you live")
            .located(By.id("zip"));
    public static final Target BUTTON_DEVICES =Target.the("Button to go to the device page")
            .located(By.xpath("//div[@class='pull-right next-step']"));
    public static final Target BUTTON_LAST =Target.the("Button to go to the last page")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD =Target.the("Password creation")
            .located(By.id("password"));
    public static final Target INPUT_VERIPASSWORD =Target.the("Password verification")
            .located(By.id("confirmPassword"));
    public static final Target CHEK_STAY =Target.the("Acceptance of terms of receiving notifications")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHEK_USE =Target.the("Acceptance of the conditions of use and conduct")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CHEK_PRIVACY =Target.the("Acceptance of the privacy and security conditions")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target FINAL_PAGE =Target.the("Check the name of the final page of the form")
            .located(By.xpath("//span[contains(text(),'The last step')]"));

}
