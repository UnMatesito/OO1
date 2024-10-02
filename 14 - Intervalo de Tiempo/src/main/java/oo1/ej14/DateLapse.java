package oo1.ej14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom(){
        return from;
    }

    public LocalDate getTo(){
        return to;
    }

    public int sizeInDays(){
        return ((int)from.until(to, ChronoUnit.DAYS));
    }

    public boolean includesDate(LocalDate other){
        return !other.isBefore(this.from) && !other.isAfter(this.to);
    }
}
