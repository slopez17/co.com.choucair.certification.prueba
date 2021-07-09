package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.model.UtestData;
import co.com.choucair.certification.prueba.userinterface.DevicesFieldsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.prueba.userinterface.DevicesFieldsPage.*;
import static org.openqa.selenium.Keys.*;


public class CompleteDevicesFields implements Task {
    private UtestData utestData;

    public CompleteDevicesFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CompleteDevicesFields withYourDeviceData(UtestData utestData) {
        return Tasks.instrumented(CompleteDevicesFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PC),
                Enter.theValue(utestData.getStrPC()).into(INPUT_PC).thenHit(ENTER),
                Click.on(DevicesFieldsPage.VERSION),
                Enter.theValue(utestData.getStrVersion()).into(INPUT_VERSION).thenHit(ENTER),
                Click.on(DevicesFieldsPage.LANGUAGE),
                Enter.theValue(utestData.getStrLanguage()).into(INPUT_LANGUAGE).thenHit(ENTER),
                Click.on(BRAND),
                Enter.theValue(utestData.getStrBrand()).into(INPUT_BRAND).thenHit(ENTER),
                Click.on(MODEL),
                Enter.theValue(utestData.getStrModel()).into(INPUT_MODEL).thenHit(ENTER),
                Click.on(OS),
                Enter.theValue(utestData.getStrOS()).into(INPUT_OS).thenHit(ENTER),
                Click.on(BUTTON_NEXT)
        );

    }
}
