package oo1.ej14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PruebasDate {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1972, 9, 15);
        System.out.println(fecha);

        LocalDate fechaInicio = LocalDate.of(1972, 12, 15);
        LocalDate fechaFin = LocalDate.of(2032, 12, 15);
        LocalDate ahora = LocalDate.now();

        if (ahora.isAfter(fechaInicio) || ahora.isEqual(fechaInicio) || ahora.isBefore(fechaFin) || ahora.isEqual(fechaFin)){
            System.out.println("La fecha de hoy se encuentra en el rango de fechas");
        } else {
            System.out.println("La fecha de hoy no es parte del rango de fechas");
        }

        System.out.println("Cantidad de dias entre las 2 fechas: " + fechaInicio.until(fechaFin, ChronoUnit.DAYS));
        System.out.println("Cantidad de meses entre las 2 fechas: " + fechaInicio.until(fechaFin, ChronoUnit.MONTHS));
        System.out.println("Cantidad de años entre las 2 fechas: " + fechaInicio.until(fechaFin, ChronoUnit.YEARS));
    }
}
