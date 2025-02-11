package co.com.practica.opencart.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

import static co.com.practica.opencart.util.Constantes.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    private static Properties propiedades = new Properties();

    @Managed(driver = "chrome")
    public static WebDriver driver;

    @Before
    public static void setTheStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Calidad");
    }

    @Dado("Procede a abrir la url")
    public void procedeAAbrirLaUrl() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver)).
                attemptsTo(Open.url(URL_OPEN_CART));
    }



}
