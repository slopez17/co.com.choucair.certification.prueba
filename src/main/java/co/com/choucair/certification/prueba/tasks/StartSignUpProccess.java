package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.prueba.userinterface.UtestHomePage.*;

public class StartSignUpProccess implements Task {

    public static StartSignUpProccess withTheRegisterForm() {
        return Tasks.instrumented(StartSignUpProccess.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SIGN_UP)
        );

    }
}
