package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestData;
import co.com.choucair.certification.prueba.userinterface.TermsAndConditionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.choucair.certification.prueba.userinterface.TermsAndConditionsPage.*;
import static org.openqa.selenium.Keys.ENTER;

public class AcceptTermsAndConditions implements Task {
    private UtestData utestData;

    public AcceptTermsAndConditions(UtestData utestData) {
        this.utestData = utestData;
    }

    public static AcceptTermsAndConditions withNewPassword(UtestData utestData) {
        return Tasks.instrumented(AcceptTermsAndConditions.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrPassword()).into(INPUT_PASSWORD).thenHit(ENTER),
                Enter.theValue(utestData.getStrPassword()).into(INPUT_CONFIRM_PASSWORD).thenHit(ENTER),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_POLICY)
        );

    }
}
