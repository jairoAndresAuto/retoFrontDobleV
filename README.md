# Serenity BDD project using Cucumber and Screenplay 

Es un proyecto tanto de back como de front, para validar los conceptos tecnicos y las buenas practicas de programación

### Prerequisites
* Java 17 installed
* Gradle  (Suggested version 7.5.1)
* IDE installed (Suggested IntelliJ IDEA 2022.2)
* Sourcetree
* Google Chrome installed

### Como instalarlo
* Instrucciones de instalacion
Realizar la clonacion del proyecto con el comando git clone https://github.com/jairoAndresAuto/retoFrontopencart.git <br>
Abrir intellij IDEA y abrir el proyecto

### Ejecución de pruebas

To run a specific Tag<br>
`gradle clean test -Dcucumber.filter.tags=@SISTEMA`

### Ejecución de pruebas con POM
in a la siguiente rura [src/test/java/co/com/practica/opencart/test]() - Clases para ejecutar test de POM <br>
`./gradlew clean test --tests ProcesoCompra`

### Descripcion de las pruebas automatizadas

Los escenarios de front son los Registrar usuario, login, resetear contraseña y compra de articulo. tambien tiene una data variable que es generada con data faker.


### Estructura del Proyecto:

[src/main/java/co/com/practica/opencart/interactions]() - consumo de los servicios de back <br>
[src/main/java/co/com/practica/opencart/questions]() - Aserciones de las pruebas. <br>
[src/main/java/co/com/practica/opencart/task]() - que ejecutan las tareas de las pruebas. <br>
[src/main/java/co/com/practica/opencart/userinterfaces]() - que es donde se almacenan los mapeos. <br>
[src/main/java/co/com/practica/opencart/util]() - Clase de utilidades genericas del proyecto <br>

[src/test/java/co/com/practica/opencart/runners]() - Clases para ejecutar los test <br>
[src/test/java/co/com/practica/opencart/stepdefinitions]() - Son la traducción de los features a código <br>
[src/test/resources/features]() - Historias de usuario que se llevarán a cabo en las pruebas <br>

### Generación de Reportes:

target/site/serenity/index.html - este es el archivo que se debe abrir para revisar los reportes de ejecucion


### Pruebas en CI/CD: <br>


### Contribución y Contacto:

[jairo.garcia@sofka.com.co](mailto:jairo.garcia@sofka.com.co)

