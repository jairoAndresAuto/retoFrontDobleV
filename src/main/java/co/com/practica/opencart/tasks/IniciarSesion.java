package co.com.practica.opencart.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.practica.opencart.userinterfaces.LoginUI.BTN_LOGIN;
import static co.com.practica.opencart.userinterfaces.RegistroUI.TXT_EMAIL;
import static co.com.practica.opencart.userinterfaces.RegistroUI.TXT_PASSWORD;

@AllArgsConstructor
public class IniciarSesion implements Task {

    private List<Map<String,String>> credenciales;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credenciales.get(0).get("user")).into(TXT_EMAIL),
                Enter.theValue(credenciales.get(0).get("contrasena")).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN));
    }

    public static IniciarSesion enAplicacion(List<Map<String,String>> credenciales) {
        return Tasks.instrumented(IniciarSesion.class,credenciales);
    }
}
