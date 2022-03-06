package co.com.choucair.certification.retot.tasks;

import co.com.choucair.certification.retot.userinterface.RegisterUtestPage;;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private String firts_name;
    private String last_name;
    private String email;

    public Register(String firts_name, String last_name, String email) {
        this.firts_name = firts_name;
        this.last_name = last_name;
        this.email = email;
    }

    public static Register the(String firts_name, String last_name, String email) {
        return Tasks.instrumented(Register.class,firts_name,last_name,email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUtestPage.JOIN_BUTTON),
                Enter.theValue(firts_name).into(RegisterUtestPage.INPUT_FIRSTNAME),
                Enter.theValue(last_name).into(RegisterUtestPage.INPUT_LASTNAME),
                Enter.theValue(email).into(RegisterUtestPage.INPUT_EMAIL),
                Click.on(RegisterUtestPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("April").from(RegisterUtestPage.SELECT_MONTH)

        );
    }
    }
