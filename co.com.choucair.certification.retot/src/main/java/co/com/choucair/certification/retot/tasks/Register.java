package co.com.choucair.certification.retot.tasks;

import co.com.choucair.certification.retot.userinterface.RegisterUtestPage;;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Register implements Task {
    private String firts_name;
    private String last_name;
    private String email;
    private String password;

    public Register(String firts_name, String last_name, String email, String password) {
        this.firts_name = firts_name;
        this.last_name = last_name;
        this.email = email;
        this.password =password;
    }

    public static Register the(String firts_name, String last_name, String email, String password) {
        return Tasks.instrumented(Register.class,firts_name,last_name,email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUtestPage.JOIN_BUTTON),
                Enter.theValue(firts_name).into(RegisterUtestPage.INPUT_FIRSTNAME),
                Enter.theValue(last_name).into(RegisterUtestPage.INPUT_LASTNAME),
                Enter.theValue(email).into(RegisterUtestPage.INPUT_EMAIL),
                Click.on(RegisterUtestPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("September").from(RegisterUtestPage.SELECT_MONTH),
                Click.on(RegisterUtestPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("4").from(RegisterUtestPage.SELECT_DAY),
                Click.on(RegisterUtestPage.SELECT_YEAR),
                SelectFromOptions.byVisibleText("2001").from(RegisterUtestPage.SELECT_YEAR),
                Click.on(RegisterUtestPage.BUTTON_LOCATION),
                Enter.theValue("Bogota").into(RegisterUtestPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(RegisterUtestPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(RegisterUtestPage.INPUT_CITY),
                Enter.theValue("110721").into(RegisterUtestPage.INPUT_ZIP),
                Click.on(RegisterUtestPage.BUTTON_DEVICES),
                Click.on(RegisterUtestPage.BUTTON_LAST),
                Enter.theValue(password).into(RegisterUtestPage.INPUT_PASSWORD),
                Enter.theValue(password).into(RegisterUtestPage.INPUT_VERIPASSWORD),
                Click.on(RegisterUtestPage.CHEK_STAY),
                Click.on(RegisterUtestPage.CHEK_USE),
                Click.on(RegisterUtestPage.CHEK_PRIVACY)

        );
    }
    }
