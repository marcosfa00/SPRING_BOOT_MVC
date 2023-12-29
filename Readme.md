# SPRING BOOT + SPRING SECURITY + JWT + MYSQL + JPA + SWAGGER
## PATRON DE DISEÑO MVC
### Modelo Vista Controlador
Para usar este patrón de diseño en este Framework se debe tener en cuenta que:
Para poder acceder a todas las clases datos etc todo debe estar dentro del mismo paquete (Al menos al principio),
Para ello dentro del paquete principal se crean 3 paquetes:
- Controller
- Repository
- Service
- Entity

#### Controller
En este paquete se crean las clases que se encargan de recibir las peticiones del cliente y enviar las respuestas al cliente.
#### Repository
En este paquete se crean las clases que se encargan de realizar las consultas a la base de datos.
#### Service
En este paquete se crean las clases que se encargan de realizar las operaciones de negocio.
#### Entity
En este paquete se crean las clases que se encargan de representar las tablas de la base de datos.

## VISTAS
Para crear la vista, como estamos hablando de una aplicación web en este caso, se necesitara un html, para ello se crea una carpeta dentro de resources llamada templates, dentro de esta carpeta se crean los html que se necesiten.
En static se crean los archivos css, js, imagenes, etc.

## CONFIGURACION
Para configurar la aplicación se crea un paquete llamado configuracion, dentro de este paquete se crea una clase llamada SwaggerConfig, en esta clase se configura el swagger para poder documentar los servicios rest.

## SEGURIDAD
Como estamos usando **Spring Security** vamos a crear un nuevo paquete llamado seguridad dentro de este paquete se crean 