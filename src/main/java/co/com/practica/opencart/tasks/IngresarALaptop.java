package co.com.practica.opencart.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.practica.opencart.userinterfaces.ComprasUI.BTN_LAPTOP;
import static co.com.practica.opencart.userinterfaces.ComprasUI.BTN_LAPTOP_TODOS;

public class IngresarALaptop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(BTN_LAPTOP),
                Click.on(BTN_LAPTOP_TODOS));
    }

    public static IngresarALaptop yNoteBook() {
        return Tasks.instrumented(IngresarALaptop.class);
    }
}
