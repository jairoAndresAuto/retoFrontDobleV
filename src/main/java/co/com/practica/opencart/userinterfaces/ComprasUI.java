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
    public static final Target TXT_NOMBRE = Target.the("boton cuenta")
            .located(By.id("input-payment-firstname"));
    public static final Target TXT_APELLIDO = Target.the("boton cuenta")
            .located(By.id("input-payment-lastname"));
    public static final Target TXT_DIRECCION = Target.the("boton cuenta")
            .located(By.id("input-payment-address-1"));
    public static final Target TXT_CIUDAD = Target.the("boton cuenta")
            .located(By.id("input-payment-city"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("boton cuenta")
            .located(By.id("input-payment-postcode"));
    public static final Target SLC_PAIS = Target.the("boton cuenta")
            .located(By.id("input-payment-country"));
    public static final Target SLC_ZONA = Target.the("boton cuenta")
            .located(By.id("input-payment-zone"));
    public static final Target BTN_CONFIRMAR_PEDIDO = Target.the("boton cuenta")
            .located(By.id("button-confirm"));
    public static final Target LBL_MENSAJE_EXITOSO_COMPRA = Target.the("boton cuenta")
            .located(By.xpath("//div[@id='content']//h1"));
    public static final Target BTN_CONTINUE_ADDRESS = Target.the("boton cuenta")
            .located(By.id("button-payment-address"));
    public static final Target BTN_CONTINUE_SHOPPING_ADDRESS = Target.the("boton cuenta")
            .located(By.id("button-shipping-address"));
    public static final Target BTN_CONTINUE_SHOPPING_METODO = Target.the("boton cuenta")
            .located(By.id("button-shipping-method"));
    public static final Target BTN_METODO_PAGO = Target.the("boton cuenta")
            .located(By.id("button-payment-method"));


}
