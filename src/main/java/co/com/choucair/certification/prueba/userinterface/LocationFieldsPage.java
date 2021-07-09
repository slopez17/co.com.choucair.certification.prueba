package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationFieldsPage {
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city")) ;
    public static final Target INPUT_ZIP = Target.the("where do we write the zip code")
            .located(By.id("zip")) ;
    public static final Target COUNTRY = Target.the("element to enable INPUT_COUNTRY ")
            .located(By.xpath("//div[@name='countryId']")) ;
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//div[@name='countryId']//input")) ;
    public static final Target BUTTON_NEXT = Target.the("button to move on next step")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']")) ;
}
