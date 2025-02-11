package co.com.practica.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResetearClaveUI {

    public static final Target BTN_OLVIDO_CONTRASEÑA = Target.the("boton cuenta")
            .located(By.xpath("//a[contains(.,'Forgotten')]"));
    public static final Target LBL_RESETEO_EXITOSO = Target.the("boton cuenta")
            .located(By.xpath("(//div[contains(.,'email')])[2]"));

}
