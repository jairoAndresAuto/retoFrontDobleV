package co.com.practica.opencart.tasks.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbrirUrl {



    public void abrirUrl(String url, WebDriver driver) {
        driver.get(url);
    }

}
