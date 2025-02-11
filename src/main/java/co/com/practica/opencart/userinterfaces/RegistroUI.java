package co.com.practica.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUI {

    private RegistroUI() {

    }

    public static final Target BTN_MY_CUENTA = Target.the("boton cuenta")
            .located(By.xpath("(//li[@class='dropdown']//a)[1]"));
    public static final Target BTN_OPCIONE_CUENTA = Target.the("boton cuenta")
            .locatedBy("//a[contains(.,'{0}')]");
    public static final Target TXT_FIRST_NAME = Target.the("boton cuenta")
            .located(By.id("input-firstname"));
    public static final Target TXT_LAST_NAME = Target.the("boton cuenta")
            .located(By.id("input-lastname"));
    public static final Target TXT_EMAIL = Target.the("boton cuenta")
            .located(By.id("input-email"));
    public static final Target TXT_TELEFONO = Target.the("boton cuenta")
            .located(By.id("input-telephone"));
    public static final Target TXT_PASSWORD = Target.the("boton cuenta")
            .located(By.id("input-password"));
    public static final Target TXT_CONFIME_PASSWORD = Target.the("boton cuenta")
            .located(By.id("input-confirm"));
    public static final Target CHX_POLITICAS = Target.the("boton cuenta")
            .located(By.name("agree"));
    public static final Target BTN_CONTINUE = Target.the("boton cuenta")
            .located(By.xpath("//input[@value='Continue']"));
    public static final Target LBL_MENSAJE = Target.the("boton cuenta")
            .located(By.xpath("//p[contains(.,'Congratulations')]"));

}
