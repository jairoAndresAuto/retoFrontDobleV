package co.com.practica.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target BTN_LOGIN = Target.the("boton cuenta")
            .located(By.xpath("//input[@value='Login']"));
    public static final Target LBL_MI_CUENTA = Target.the("boton cuenta")
            .located(By.xpath("//h2[contains(.,'My Account')]"));
    public static final Target LBL_ERROR = Target.the("boton cuenta")
            .located(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));


}
