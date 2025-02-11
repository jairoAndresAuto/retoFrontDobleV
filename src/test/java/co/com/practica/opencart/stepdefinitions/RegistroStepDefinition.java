package co.com.practica.opencart.stepdefinitions;

import co.com.practica.opencart.questions.ValidarMensaje;
import co.com.practica.opencart.tasks.IngresarOpcion;
import co.com.practica.opencart.tasks.RealizarRegistro;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.practica.opencart.userinterfaces.RegistroUI.LBL_MENSAJE;
import static co.com.practica.opencart.util.Constantes.MENSAJE_EXITOSO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition {


    @Dado("que el usuario de dirige a la opcion de registro")
    public void queElUsuarioDeDirigeALaOpcionDeRegistro() {
        theActorInTheSpotlight().attemptsTo(IngresarOpcion.cuenta("Register"));
    }

    @Cuando("Se procede a registrarse")
    public void seProcedeARegistrarse() {
        theActorInTheSpotlight().attemptsTo(RealizarRegistro.usuario());
    }

    @Entonces("se valida que el mensaje de exito")
    public void seValidaQueElMensajeDeExito() {
theActorInTheSpotlight().should(seeThat(
        ValidarMensaje.deElementos(LBL_MENSAJE.resolveFor(theActorInTheSpotlight()).getText(),MENSAJE_EXITOSO)));
    }

}
