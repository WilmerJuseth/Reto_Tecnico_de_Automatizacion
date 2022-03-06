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
}
