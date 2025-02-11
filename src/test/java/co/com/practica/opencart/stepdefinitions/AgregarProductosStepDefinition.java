package co.com.practica.opencart.stepdefinitions;

import co.com.practica.opencart.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductosStepDefinition {

    @Cuando("Realiza el ingreso a Laptops & Notebooks")
    public void realizaElIngresoALaptopsNotebooks() {
        theActorInTheSpotlight().attemptsTo(IngresarALaptop.yNoteBook());
    }

    @Y("agrega el que se llama {string}")
    public void agregaElQueSeLlama(String producto) {
        theActorInTheSpotlight().attemptsTo(EscogerProducto.MacBook(producto));
    }

    @Y("Luego realiza la busqueda de un tablet {string}")
    public void luegoRealizaLaBusquedaDeUnTablet(String producto) {
        theActorInTheSpotlight().attemptsTo(RealizarBusqueda.yEscogerTablet(producto));
    }

    @E("ingresa al carrito y elimina el MacBook Pro")
    public void ingresaAlCarritoYEliminaElMacBookPro() {
        theActorInTheSpotlight().attemptsTo(IngresarAlCarro.eliminarMacBook());
    }

    @Y("le agrega una unidad mas a la tablet")
    public void leAgregaUnaUnidadMasALaTablet() {
        theActorInTheSpotlight().attemptsTo(AgregarUnidad.Samsung());
    }

    @Y("luego realiza todo el proceso de compra")
    public void luegoRealizaTodoElProcesoDeCompra() {
        theActorInTheSpotlight().attemptsTo();
    }

    @Entonces("vera el mensaje de exito de la compra")
    public void veraElMensajeDeExitoDeLaCompra() {

    }


}
