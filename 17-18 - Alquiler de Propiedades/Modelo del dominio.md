# Modelado de Dominio
## Ejercicio 17-18

### Conceptos candidatos

* Gestion de reservas(OOBnB)
* Gestionar inmuebles
* Realizar reservas
* Usuarios
* nombre
* direccion
* DNI
* Propiedades
* direccion
* nombre descriptivo
* precio por noche
* Reservas
* Consultar disponibilidad de una propiedad //propiedad
* Crear reserva //Usuario
* propiedad disponible
* Calcular precio de reserva (cantidad de noches * precio por noche) //Reserva
* Cancelar una reserva //usuario
* Calcular ingresos de una reserva //Propiedad
* retribucion al propietario
* 75% de suma
* Manejar periodos de reserva 

### Creacion de clases

<p align="center">
    <img src="./img/Classes.png" alt="Classes"/>
</p>

### Asignacion de atributos a cada clase

<p align="center">
    <img src="./img/ClassesAtributos.png" alt="Atributes"/>
</p>


### Asignacion de asociaciones

<p align="center">
    <img src="./img/Dominio.png" alt="Domain"/>
</p>

### Anotaciones

* Para el metodo overlapse se utilizo composicion debido a que una herencia rompe con el concepto de "es-un"
* Se crearon los metodos protected `noSeEncuentraEnPeriodo()` y `estaDisponible()` para una mejor delegacion de responsbilidades y que los metodos no queden largos.
* Ademas se crearon los metodos `entreFechas()` y `fechaDentroDePeriodo()` que delegan responsabilidades a los objetos correspondientes, en este caso `PeriodoReserva`
* 