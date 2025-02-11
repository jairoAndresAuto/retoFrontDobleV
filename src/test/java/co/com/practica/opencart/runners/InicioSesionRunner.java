package co.com.practica.opencart.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sistema/validar_inicio_sesion.feature"
        , glue = "co.com.practica.opencart.stepdefinitions"
        , snippets = CAMELCASE)
public class InicioSesionRunner {
}
