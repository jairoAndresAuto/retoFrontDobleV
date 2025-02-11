package co.com.practica.opencart.stepdefinitions;

import co.com.practica.opencart.questions.ValidarMensaje;
import co.com.practica.opencart.tasks.IngresarOpcion;
import co.com.practica.opencart.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.List;
import java.util.Map;

import static co.com.practica.opencart.userinterfaces.LoginUI.LBL_ERROR;
import static co.com.practica.opencart.userinterfaces.LoginUI.LBL_MI_CUENTA;
import static co.com.practica.opencart.util.Constantes.MENSAJE_INICIO_SESION;
import static co.com.practica.opencart.util.Constantes.MENSAJE_INICIO_SESION_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinition {

    @Dado("que el usuario de dirige a la opcion de login")
    public void queElUsuarioDeDirigeALaOpcionDeLogin() {
        theActorInTheSpotlight().attemptsTo(IngresarOpcion.cuenta("Login"));
    }

    @Cuando("Se procede a ingresar las credenciales")
    public void seProcedeAIngresarLasCredenciales(List<Map<String, String>> credenciales) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enAplicacion(credenciales));
    }

    @Entonces("se valida ingrese a la app")
    public void seValidaIngreseALaApp() {
        theActorInTheSpotlight().should(seeThat(
                ValidarMensaje.deElementos(LBL_MI_CUENTA.resolveFor(theActorInTheSpotlight()).getText(),MENSAJE_INICIO_SESION)));
    }

    @Entonces("se valida que el mensaje error")
    public void seValidaQueElMensajeError() {
        theActorInTheSpotlight().should(seeThat(
                ValidarMensaje.deElementos(LBL_ERROR.resolveFor(theActorInTheSpotlight()).getText(),MENSAJE_INICIO_SESION_ERROR)));
    }
}
