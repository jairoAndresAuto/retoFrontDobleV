package co.com.practica.opencart.tasks;

import co.com.practica.opencart.interactions.Espera;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Locale;

import static co.com.practica.opencart.userinterfaces.ComprasUI.*;
import static co.com.practica.opencart.userinterfaces.RegistroUI.BTN_CONTINUE;
import static co.com.practica.opencart.userinterfaces.RegistroUI.CHX_POLITICAS;
import static co.com.practica.opencart.util.Constantes.ESPANIOL;
import static co.com.practica.opencart.util.Constantes.TIEMPO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarProceso implements Task {

    private String producto;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_CONTINUE_ADDRESS),
                Espera.unTiempo(TIEMPO),
                Scroll.to(BTN_CONTINUE_SHOPPING_ADDRESS),
                Click.on(BTN_CONTINUE_SHOPPING_ADDRESS),
                Espera.unTiempo(TIEMPO),
                Scroll.to(BTN_CONTINUE_SHOPPING_METODO),
                Click.on(BTN_CONTINUE_SHOPPING_METODO),
                Espera.unTiempo(TIEMPO),
                Scroll.to(CHX_POLITICAS),
                Click.on(CHX_POLITICAS),
                Click.on(BTN_METODO_PAGO),
                Espera.unTiempo(TIEMPO),
                Scroll.to(BTN_CONFIRMAR_PEDIDO),
                Click.on(BTN_CONFIRMAR_PEDIDO),
                Espera.unTiempo(TIEMPO));
    }

    public static RealizarProceso compra() {
        return Tasks.instrumented(RealizarProceso.class);
    }
}
