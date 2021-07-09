package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalFieldsPage {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName")) ;
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName")) ;
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email")) ;
    public static final Target SELECT_BIRTH_MONTH = Target.the("where do we write the birth month")
            .located(By.id("birthMonth")) ;
    public static final Target SELECT_BIRTH_DAY = Target.the("where do we write the birth day")
            .located(By.id("birthDay")) ;
    public static final Target SELECT_BIRTH_YEAR = Target.the("where do we write the birth year")
            .located(By.id("birthYear")) ;
    public static final Target LANGUAGE = Target.the("element to enable INPUT_LANGUAGE ")
            .located(By.id("languages")) ;
    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language")
            .located(By.xpath("//div[@id='languages']//input")) ;
    public static final Target BUTTON_NEXT = Target.the("button to move on next step")
            .located(By.xpath("//a[@aria-label='Next step - define your location']")) ;
}
