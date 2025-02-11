package co.com.practica.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUI {

    private RegistroUI() {

    }

    public static final Target BTN_MY_CUENTA = Target.the("boton mi cuenta")
            .located(By.xpath("(//li[@class='dropdown']//a)[1]"));
    public static final Target BTN_OPCIONE_CUENTA = Target.the("boton opciones cuenta")
            .locatedBy("//a[contains(.,'{0}')]");
    public static final Target TXT_FIRST_NAME = Target.the("texto primer nombre")
            .located(By.id("input-firstname"));
    public static final Target TXT_LAST_NAME = Target.the("texto primer apellido")
            .located(By.id("input-lastname"));
    public static final Target TXT_EMAIL = Target.the("texto email ")
            .located(By.id("input-email"));
    public static final Target TXT_TELEFONO = Target.the("texto telefono")
            .located(By.id("input-telephone"));
    public static final Target TXT_PASSWORD = Target.the("texto password")
            .located(By.id("input-password"));
    public static final Target TXT_CONFIME_PASSWORD = Target.the("texto confirmar password")
            .located(By.id("input-confirm"));
    public static final Target CHX_POLITICAS = Target.the("Cheackbox politicas")
            .located(By.name("agree"));
    public static final Target BTN_CONTINUE = Target.the("boton continuar")
            .located(By.xpath("//input[@value='Continue']"));
    public static final Target LBL_MENSAJE = Target.the("etiqueta mensaje")
            .located(By.xpath("//p[contains(.,'Congratulations')]"));

}
