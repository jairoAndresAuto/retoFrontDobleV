#language: es
## jairo_garcia82122@elpoli.edu.co
Característica: validar registro
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el front de regitro de la plataforma
  Con el fin de presentar un stack de pruebas referenciado a dicha funcionalidad

  Antecedentes:
    Dado Procede a abrir la url

  Escenario: ValidarRegistro
    Dado que el usuario de dirige a la opcion de registro
    Cuando Se procede a registrarse
    Entonces se valida que el mensaje de exito