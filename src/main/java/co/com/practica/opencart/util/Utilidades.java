package co.com.practica.opencart.util;

import java.util.Base64;

public class Utilidades {

    private Utilidades() {
    }

    public static String codificacionBase64(String clave) {
        byte[] decodedBytes = Base64.getDecoder().decode(clave);
        return new String(decodedBytes);
    }

}
