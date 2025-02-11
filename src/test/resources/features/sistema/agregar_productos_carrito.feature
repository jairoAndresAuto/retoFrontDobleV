#language: es
## jairo_garcia82122@elpoli.edu.co
Característica: validar inicio de sesion
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el front de inicio de sesion
  Con el fin de presentar un stack de pruebas referenciado a dicha funcionalidad

  Antecedentes:
    Dado Procede a abrir la url

  Escenario: validar inicio de sesion
    Dado que el usuario de dirige a la opcion de login
    Cuando Se procede a ingresar las credenciales
      | user            | contrasena |
      | jairo@gmail.com | 1234       |
    Y va la sesion de