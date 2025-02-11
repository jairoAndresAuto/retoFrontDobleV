package co.com.practica.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprasUI {

    public static final Target BTN_LAPTOP = Target.the("boton laptop")
            .locatedBy("//a[contains(.,'Laptop')]");
    public static final Target BTN_LAPTOP_TODOS = Target.the("boton laptop todos")
            .locatedBy("//a[contains(.,'Show All Laptops & Notebooks')]");
    public static final Target BTN_ADD_PRODUCTO = Target.the("boton agregar producto")
            .locatedBy("//h4[contains(.,'{0}')]/../..//div[@class='button-group']//button");
    public static final Target TXT_BUSCAR = Target.the("texto buscar")
            .located(By.name("search"));
    public static final Target BTN_BUSCAR = Target.the("boton buscar")
            .located(By.xpath("//div[@id='search']//button"));
    public static final Target BTN_CARRITO = Target.the("boton carrito")
            .located(By.xpath("//a[@title='Shopping Cart']"));
    public static final Target BTN_REMOVER = Target.the("boton remover")
            .located(By.xpath("//button[@class='btn btn-danger']"));
    public static final Target TXT_CANTIDAD = Target.the("texto cantidad")
            .located(By.xpath("//div[@class='input-group btn-block']//input"));
    public static final Target BTN_REFRESCAR = Target.the("boton refrescar")
            .located(By.xpath("//button[@data-original-title='Update']"));
    public static final Target BTN_CHECKOUT = Target.the("boton checkout")
            .located(By.xpath("(//a[contains(.,'Check')])[3]"));
    public static final Target TXT_NOMBRE = Target.the("texto Nombre")
            .located(By.id("input-payment-firstname"));
    public static final Target TXT_APELLIDO = Target.the("texto apellido")
            .located(By.id("input-payment-lastname"));
    public static final Target TXT_DIRECCION = Target.the("texto direccion")
            .located(By.id("input-payment-address-1"));
    public static final Target TXT_CIUDAD = Target.the("texto ciudad")
            .located(By.id("input-payment-city"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("texto codigo")
            .located(By.id("input-payment-postcode"));
    public static final Target SLC_PAIS = Target.the("seleccionar pais")
            .located(By.id("input-payment-country"));
    public static final Target SLC_ZONA = Target.the("seleccionar zona")
            .located(By.id("input-payment-zone"));
    public static final Target BTN_CONFIRMAR_PEDIDO = Target.the("boton confirmar pedido")
            .located(By.id("button-confirm"));
    public static final Target LBL_MENSAJE_EXITOSO_COMPRA = Target.the("Etiqueta mensaje compra")
            .located(By.xpath("//div[@id='content']//h1"));
    public static final Target BTN_CONTINUE_ADDRESS = Target.the("boton continuar direccion")
            .located(By.id("button-payment-address"));
    public static final Target BTN_CONTINUE_SHOPPING_ADDRESS = Target.the("boton continuar compra")
            .located(By.id("button-shipping-address"));
    public static final Target BTN_CONTINUE_SHOPPING_METODO = Target.the("boton metodo de compra")
            .located(By.id("button-shipping-method"));
    public static final Target BTN_METODO_PAGO = Target.the("boton metodo pago")
            .located(By.id("button-payment-method"));


}
