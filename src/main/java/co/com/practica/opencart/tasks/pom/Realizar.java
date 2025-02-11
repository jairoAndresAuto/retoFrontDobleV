package co.com.practica.opencart.tasks.pom;

import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;

import static co.com.practica.opencart.userinterfaces.page.Page.*;


public class Realizar {



    public void login(String usuario,String clave,WebDriver driver) throws InterruptedException {

        driver.findElement(MY_CUENTA).click();
        driver.findElement(LOGIN).click();
        Thread.sleep(2000);
        driver.findElement(EMAIL).sendKeys(usuario);
        driver.findElement(PASSWORD).sendKeys(clave);
        driver.findElement(BTN_LOGIN).click();
    }
}
