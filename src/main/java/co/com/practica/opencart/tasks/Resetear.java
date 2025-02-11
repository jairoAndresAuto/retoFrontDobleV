package co.com.practica.opencart.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.practica.opencart.userinterfaces.RegistroUI.BTN_CONTINUE;
import static co.com.practica.opencart.userinterfaces.RegistroUI.TXT_EMAIL;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Resetear implements Task {

    private String correo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TXT_EMAIL,isVisible()),
                Enter.theValue(correo).into(TXT_EMAIL),
                Click.on(BTN_CONTINUE));
    }

    public static Resetear clave(String correo) {
        return Tasks.instrumented(Resetear.class,correo);
    }
}
