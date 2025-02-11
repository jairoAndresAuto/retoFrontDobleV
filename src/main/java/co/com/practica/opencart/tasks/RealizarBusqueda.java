package co.com.practica.opencart.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;
import java.util.Map;

import static co.com.practica.opencart.userinterfaces.ComprasUI.*;

@AllArgsConstructor
public class RealizarBusqueda implements Task {

    private String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TXT_BUSCAR),
                Enter.theValue(producto).into(TXT_BUSCAR),
                Click.on(BTN_BUSCAR),
                Scroll.to(BTN_ADD_PRODUCTO.of(producto)),
                Click.on(BTN_ADD_PRODUCTO.of(producto)));
    }

    public static RealizarBusqueda yEscogerTablet(String producto) {
        return Tasks.instrumented(RealizarBusqueda.class, producto);
    }
}
