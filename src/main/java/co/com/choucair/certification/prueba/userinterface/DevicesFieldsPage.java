package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesFieldsPage {
    public static final Target PC = Target.the("element to enable INPUT_PC ")
            .located(By.xpath("//div[@name='osId']")) ;
    public static final Target INPUT_PC = Target.the("where do we write the PC OS")
            .located(By.xpath("//div[@name='osId']//input")) ;
    public static final Target VERSION = Target.the("element to enable INPUT_VERSION ")
            .located(By.xpath("//div[@name='osVersionId']")) ;
    public static final Target INPUT_VERSION = Target.the("where do we write the PC version")
            .located(By.xpath("//div[@name='osVersionId']//input")) ;
    public static final Target LANGUAGE = Target.the("element to enable INPUT_LANGUAGE ")
            .located(By.xpath("//div[@name='osLanguageId']")) ;
    public static final Target INPUT_LANGUAGE = Target.the("where do we write the PC language")
            .located(By.xpath("//div[@name='osLanguageId']//input")) ;
    public static final Target BRAND = Target.the("element to enable INPUT_BRAND ")
            .located(By.xpath("//div[@name='handsetMakerId']")) ;
    public static final Target INPUT_BRAND = Target.the("where do we write the mobile device brand")
            .located(By.xpath("//div[@name='handsetMakerId']//input")) ;
    public static final Target MODEL = Target.the("element to enable INPUT_MODEL ")
            .located(By.xpath("//div[@name='handsetModelId']")) ;
    public static final Target INPUT_MODEL = Target.the("where do we write the mobile device model")
            .located(By.xpath("//div[@name='handsetModelId']//input")) ;
    public static final Target OS = Target.the("element to enable INPUT_OS ")
            .located(By.xpath("//div[@name='handsetOSId']")) ;
    public static final Target INPUT_OS = Target.the("where do we write the mobile device OS")
            .located(By.xpath("//div[@name='handsetOSId']//input")) ;
    public static final Target BUTTON_NEXT = Target.the("button to move on next step")
            .located(By.xpath("//a[@aria-label='Next - final step']")) ;
}
