package co.com.practica.opencart.tasks;

import com.github.javafaker.Faker;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Locale;

import static co.com.practica.opencart.userinterfaces.RegistroUI.*;
import static co.com.practica.opencart.util.Constantes.ESPANIOL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarRegistro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale("en_ES"));
        String nombre = faker.name().firstName();
        String apellido = faker.name().lastName();
        String correo = nombre + "@gmail.com";
        actor.attemptsTo(WaitUntil.the(TXT_FIRST_NAME, isEnabled()),
                Enter.theValue(nombre).into(TXT_FIRST_NAME),
                Enter.theValue(apellido).into(TXT_LAST_NAME),
                Enter.theValue(correo).into(TXT_EMAIL),
                Enter.theValue("3103456787").into(TXT_TELEFONO),
                Enter.theValue("1234").into(TXT_PASSWORD),
                Enter.theValue("1234").into(TXT_CONFIME_PASSWORD),
                Click.on(CHX_POLITICAS),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(LBL_MENSAJE, isVisible())
        );
    }

    public static RealizarRegistro usuario() {
        return Tasks.instrumented(RealizarRegistro.class);
    }
}
