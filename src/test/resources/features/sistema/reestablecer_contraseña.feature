#language: es
## jairo_garcia82122@elpoli.edu.co
Característica: reestablecer contraseña
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el front de reestablecer contraseña
  Con el fin de presentar un stack de pruebas referenciado a dicha funcionalidad

  Antecedentes:
    Dado Procede a abrir la url

  Escenario: reestablecer contraseña
    Dado que el usuario de dirige a la opcion de login
    Cuando Se procede a ingresar a olvido contasena
    Y procede a resetear la contasena "andres1234@gmail.com"
    Entonces se valida que el mensaje exitoso

  Escenario: reestablecer contraseña con correo no valido
    Dado que el usuario de dirige a la opcion de login
    Cuando Se procede a ingresar a olvido contasena
    Y procede a resetear la contasena "andr####@gmail.com"
    Entonces se valida que el mensaje de error