package co.com.practica.opencart.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.practica.opencart.userinterfaces.ComprasUI.*;

@AllArgsConstructor
public class EscogerProducto implements Task {

    private String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_ADD_PRODUCTO.of(producto)));
        actor.attemptsTo(Click.on(BTN_ADD_PRODUCTO.of(producto)));
    }

    public static EscogerProducto MacBook(String producto) {
        return Tasks.instrumented(EscogerProducto.class,producto);
    }
}
