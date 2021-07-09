package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestData;
import co.com.choucair.certification.prueba.userinterface.PersonalFieldsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.prueba.userinterface.PersonalFieldsPage.*;
import static org.openqa.selenium.Keys.ENTER;

public class CompletePersonalFields implements Task {
    private UtestData utestData;

    public CompletePersonalFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CompletePersonalFields withYourselfData(UtestData utestData) {
        return Tasks.instrumented(CompletePersonalFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(utestData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(utestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getStrBirthMonth()).from(SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(utestData.getStrBirthDay()).from(SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(utestData.getStrBirthYear()).from(SELECT_BIRTH_YEAR),
                Click.on(LANGUAGE),
                Enter.theValue(utestData.getStrLanguages()).into(INPUT_LANGUAGE).thenHit(ENTER),
                Click.on(BUTTON_NEXT)
        );

    }
}
