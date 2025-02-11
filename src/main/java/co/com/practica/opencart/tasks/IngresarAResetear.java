package co.com.practica.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.practica.opencart.userinterfaces.ResetearClaveUI.BTN_OLVIDO_CONTRASEÑA;

public class IngresarAResetear implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_OLVIDO_CONTRASEÑA));
    }

    public static IngresarAResetear clave() {
        return Tasks.instrumented(IngresarAResetear.class);
    }
}
