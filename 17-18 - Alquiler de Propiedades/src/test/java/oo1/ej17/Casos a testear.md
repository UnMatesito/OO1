# Casos para realizar los tests

Nos interesaria testear el caso de agregar una reserva y cancelar una reserva

## Agregar una reserva

**Casos de testeo**
1. Reserva que no se superpone con otra reserva
2. Reserva que se superpone con otra reserva

**Resultados**
1. Se agrega la reserva a la coleccion de reservas de la propiedad, es decir que pasa a estar ocupado en ese periodo
2. No se agrega la reserva, debido a que esta ocupada

## Cancelar una reserva

**Casos de testeo**
1. La fecha actual no se encuentra en el periodo de la reserva
2. La fecha actual se encuentra en el periodo de la reserva

**Resultados**
1. La Reserva se cancela exitosamente
2. No se cancela la reserva