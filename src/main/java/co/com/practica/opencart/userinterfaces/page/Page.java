package co.com.practica.opencart.userinterfaces.page;

import org.openqa.selenium.By;

public class Page {

    public static By MY_CUENTA = By.xpath("//a[@title='My Account']");
    public static By LOGIN = By.xpath("//a[contains(.,'Login')]");
    public static By EMAIL = By.id("input-email");
    public static By PASSWORD = By.id("input-password");
    public static By BTN_LOGIN = By.xpath("//input[@value='Login']");

}
