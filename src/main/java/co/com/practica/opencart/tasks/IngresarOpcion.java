package co.com.practica.opencart.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.practica.opencart.userinterfaces.RegistroUI.BTN_MY_CUENTA;
import static co.com.practica.opencart.userinterfaces.RegistroUI.BTN_OPCIONE_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

@AllArgsConstructor
public class IngresarOpcion implements Task {

    String opcion;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_MY_CUENTA,isClickable()),
                Click.on(BTN_MY_CUENTA),
                Click.on(BTN_OPCIONE_CUENTA.of(opcion)));
    }

    public static IngresarOpcion cuenta(String opcion) {
        return Tasks.instrumented(IngresarOpcion.class,opcion);
    }
}
