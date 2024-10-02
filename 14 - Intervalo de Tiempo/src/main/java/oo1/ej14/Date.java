package oo1.ej14;

import java.time.LocalDate;

public interface Date {
    LocalDate getFrom();
    int sizeInDays();
    boolean includesDate(LocalDate other);
}
