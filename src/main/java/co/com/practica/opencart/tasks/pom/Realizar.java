package co.com.practica.opencart.tasks.pom;

import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.com.practica.opencart.util.Constantes.TIEMPO;

public class Realizar {



    public void login(String usuario,String clave,WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[contains(.,'Login')]")).click();
        Thread.sleep(TIEMPO);
        driver.findElement(By.id("input-email")).sendKeys(usuario);
        driver.findElement(By.id("input-password")).sendKeys(clave);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
