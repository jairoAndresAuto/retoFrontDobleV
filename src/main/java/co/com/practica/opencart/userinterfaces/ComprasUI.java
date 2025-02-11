package co.com.practica.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprasUI {

    public static final Target BTN_LAPTOP = Target.the("boton cuenta")
            .locatedBy("//a[contains(.,'Laptop')]");
    public static final Target BTN_LAPTOP_TODOS = Target.the("boton cuenta")
            .locatedBy("//a[contains(.,'Show All Laptops & Notebooks')]");
    public static final Target BTN_ADD_PRODUCTO = Target.the("boton cuenta")
            .locatedBy("//h4[contains(.,'{0}')]/../..//div[@class='button-group']//button");
    public static final Target TXT_BUSCAR = Target.the("boton cuenta")
            .located(By.name("search"));
    public static final Target BTN_BUSCAR = Target.the("boton cuenta")
            .located(By.xpath("//div[@id='search']//button"));
    public static final Target BTN_CARRITO = Target.the("boton cuenta")
            .located(By.xpath("//a[@title='Shopping Cart']"));
    public static final Target BTN_REMOVER = Target.the("boton cuenta")
            .located(By.xpath("//button[@class='btn btn-danger']"));
    public static final Target TXT_CANTIDAD = Target.the("boton cuenta")
            .located(By.xpath("//div[@class='input-group btn-block']//input"));
    public static final Target BTN_REFRESCAR = Target.the("boton cuenta")
            .located(By.xpath("//button[@data-original-title='Update']"));
    public static final Target BTN_CHECKOUT = Target.the("boton cuenta")
            .located(By.xpath("(//a[contains(.,'Check')])[3]"));

}
