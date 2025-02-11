#language: es
## jairo_garcia82122@elpoli.edu.co
Característica: validar inicio de sesion
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el front de inicio de sesion
  Con el fin de presentar un stack de pruebas referenciado a dicha funcionalidad

  Antecedentes:
    Dado Procede a abrir la url

  Esquema del escenario: validar inicio de sesion
    Dado que el usuario de dirige a la opcion de login
    Cuando Se procede a ingresar las credenciales
      | user   | contrasena   |
      | <user> | <contrasena> |
    Entonces se valida ingrese a la app

    Ejemplos:
      | user            | contrasena |
      | jairo@gmail.com | 1234       |

  Esquema del escenario: validar inicio de sesion con credenciales erroneas
    Dado que el usuario de dirige a la opcion de login
    Cuando Se procede a ingresar las credenciales
      | user   | contrasena   |
      | <user> | <contrasena> |
    Entonces se valida que el mensaje error

    Ejemplos:
      | user                | contrasena |
      | wreewfewr@gmail.com | 1234       |