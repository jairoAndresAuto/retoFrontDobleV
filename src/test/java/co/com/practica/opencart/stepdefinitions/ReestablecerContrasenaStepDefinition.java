package co.com.practica.opencart.stepdefinitions;

import co.com.practica.opencart.questions.ValidarMensaje;
import co.com.practica.opencart.tasks.IngresarAResetear;
import co.com.practica.opencart.tasks.Resetear;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static co.com.practica.opencart.userinterfaces.LoginUI.LBL_ERROR;
import static co.com.practica.opencart.userinterfaces.ResetearClaveUI.LBL_RESETEO_EXITOSO;
import static co.com.practica.opencart.util.Constantes.MENSAJE_RESETEO_EXITOSO;
import static co.com.practica.opencart.util.Constantes.MENSAJE_RESETEO_FALLIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReestablecerContrasenaStepDefinition {

    @Cuando("Se procede a ingresar a olvido contasena")
    public void seProcedeAIngresarAOlvidoContasena() {
        theActorInTheSpotlight().attemptsTo(IngresarAResetear.clave());
    }

    @Y("procede a resetear la contasena {string}")
    public void procedeAResetearLaContasena(String correo) {
        theActorInTheSpotlight().attemptsTo(Resetear.clave(correo));
    }

    @Entonces("se valida que el mensaje exitoso")
    public void seValidaQueElMensajeExitoso() {
        theActorInTheSpotlight().should(seeThat(ValidarMensaje.deElementos(
                LBL_RESETEO_EXITOSO.resolveFor(theActorInTheSpotlight()).getText(), MENSAJE_RESETEO_EXITOSO)));
    }

    @Entonces("se valida que el mensaje de error")
    public void seValidaQueElMensajeDeError() {
        theActorInTheSpotlight().should(seeThat(ValidarMensaje.deElementos(
                LBL_ERROR.resolveFor(theActorInTheSpotlight()).getText(), MENSAJE_RESETEO_FALLIDO)));
    }
}
