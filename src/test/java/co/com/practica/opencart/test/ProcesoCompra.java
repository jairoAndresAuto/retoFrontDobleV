package co.com.practica.opencart.test;

import co.com.practica.opencart.tasks.pom.AbrirUrl;
import co.com.practica.opencart.tasks.pom.Realizar;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static co.com.practica.opencart.util.Constantes.TIEMPO;
import static co.com.practica.opencart.util.Constantes.URL_OPEN_CART;

public class ProcesoCompra {

    private static WebDriver driver;

    @Before
    public void setUpBeforeClass() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testCompra() throws InterruptedException {
        AbrirUrl urlPagina = new AbrirUrl();
        urlPagina.abrirUrl(URL_OPEN_CART, driver);
        Realizar login = new Realizar();
        login.login("jairo@gmail.com", "1234", driver);
        Thread.sleep(TIEMPO);
        Assert.assertEquals(
                driver.findElement(By.xpath("//h2[contains(.,'My Account')]")).getText(),
                "My Account");
    }

    @After
    public void setAfterClass() {
        driver.quit();
    }

}
