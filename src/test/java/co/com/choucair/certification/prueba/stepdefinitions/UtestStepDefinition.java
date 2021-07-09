package co.com.choucair.certification.prueba.stepdefinitions;

import co.com.choucair.certification.prueba.model.UtestData;
import co.com.choucair.certification.prueba.questions.Answer;
import co.com.choucair.certification.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certification.prueba.util.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinition {
    @Before()
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than the user wants to sign up at utest$")
    public void thanTheUserWantsToSignUpAtUtest() {
        theActorCalled(ACTOR_NAME).wasAbleTo(
                OpenUp.theUtestPage(),
                StartSignUpProccess.withTheRegisterForm()
        );

    }


    @When("^the user enter its log$")
    public void theUserEnterItsLog(List<UtestData> utestData)throws Exception {
        theActorInTheSpotlight().attemptsTo(
                CompletePersonalFields.withYourselfData(utestData.get(ZERO)),
                CompleteLocationFields.withYourAddressData(utestData.get(ZERO)),
                CompleteDevicesFields.withYourDeviceData(utestData.get(ZERO)),
                AcceptTermsAndConditions.withNewPassword(utestData.get(ZERO))
        );

    }

    @Then("^the user can see$")
    public void theUserCanSee(List<UtestData> utestData)throws Exception {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(utestData.get(ZERO))));
    }
}
