### Prueba Técnica para Postulante Trainee/Junior
## Sistema de Tickets para Reserva de Asientos en Anfiteatro

En esta fase del desarrollo, se plantea el "sistema de tickets" que cada persona obtendrá al reservar un asiento en el anfiteatro. A continuación, se detallan los pasos a seguir:

## Plantilla de Ticket

Se ha creado una plantilla para almacenar los siguientes datos por ticket:
- Número de ticket.
- Fila y asiento reservados.
- Fecha de compra.
- Fecha de validez.
- Precio.

## Base de Datos Lógica

Se utiliza una estructura de datos que actúa como una "base de datos lógica" para almacenar un número indeterminado de tickets. A continuación, se cargan una serie de tickets en esta estructura.

## Cálculo del Total de Precios

Se ha implementado un método que recorre la estructura de tickets seleccionada y suma los precios de todos los tickets. El resultado se muestra por pantalla. No es necesario el uso de una interfaz gráfica de usuario (IGU) para esto.

## Visualización de Tickets por Fila

El programa solicita al usuario que ingrese un número de fila. A partir de esta entrada, se muestran por pantalla los datos de los tickets pertenecientes a esa fila. No se requiere una interfaz gráfica de usuario (IGU) para esta funcionalidad.

## Consideraciones

No es necesaria la implementación de una interfaz gráfica de usuario (IGU) ni de una base de datos (BD). Se evaluará al 100% el manejo lógico del desarrollo de la aplicación.

## Implementación Extra: Plantilla de Clientes

En caso de desear agregar una plantilla para clientes con los datos: id, DNI, nombre, apellido, la implementación se realizaría mediante una estructura de datos adicional. Cada ticket podría estar relacionado con un cliente asignando el id del cliente correspondiente al ticket. Esto permitiría que un ticket posea los datos del cliente que lo tiene asignado.

---

**Extra: Plantilla de Clientes**
- Datos del Cliente:
  - ID.
  - DNI.
  - Nombre.
  - Apellido.

**Relación Cliente-Ticket:**
- Cada ticket puede tener asociado el ID del cliente correspondiente.

**Implementación:**
- Al crear un nuevo ticket, se asigna el ID del cliente correspondiente.
- Para mostrar los datos del cliente asociado a un ticket, se accede a la base de datos de clientes usando el ID almacenado en el ticket.

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una solicitud de extracción.
