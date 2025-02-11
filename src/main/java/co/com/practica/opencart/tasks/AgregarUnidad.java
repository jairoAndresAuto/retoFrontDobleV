package co.com.practica.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.practica.opencart.userinterfaces.ComprasUI.*;

public class AgregarUnidad implements Task {

    private String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(TXT_CANTIDAD),
                Enter.theValue("2").into(TXT_CANTIDAD),
                Click.on(BTN_REFRESCAR),
                Click.on(BTN_CHECKOUT));
    }

    public static AgregarUnidad Samsung() {
        return Tasks.instrumented(AgregarUnidad.class);
    }
}
