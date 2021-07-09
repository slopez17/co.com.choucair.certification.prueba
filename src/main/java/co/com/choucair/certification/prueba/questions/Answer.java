package co.com.choucair.certification.prueba.questions;

import co.com.choucair.certification.prueba.model.UtestData;
import co.com.choucair.certification.prueba.userinterface.TermsAndConditionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.prueba.userinterface.TermsAndConditionsPage.*;


public class Answer implements Question<Boolean> {

    private UtestData utestData;

    public Answer(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Answer toThe(UtestData utestData) {
        return new Answer(utestData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String question = Text.of(TEXT_FINAL).viewedBy(actor).asString();
        if(question.equals(utestData.getStrMessage())){
            return true;
        }
        return false;
    }
}
