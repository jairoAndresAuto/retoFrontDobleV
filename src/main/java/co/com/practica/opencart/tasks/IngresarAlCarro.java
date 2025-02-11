package co.com.practica.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.practica.opencart.userinterfaces.ComprasUI.BTN_CARRITO;
import static co.com.practica.opencart.userinterfaces.ComprasUI.BTN_REMOVER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarAlCarro implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CARRITO),
                WaitUntil.the(BTN_REMOVER,isVisible()),
                Click.on(BTN_REMOVER));
    }

    public static IngresarAlCarro eliminarMacBook() {
        return Tasks.instrumented(IngresarAlCarro.class);
    }

}
