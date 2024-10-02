package oo1.ej14;

import java.time.LocalDate;

public class NewDateLapse implements Date{
    private LocalDate from;
    private int sizeInDays;

    public NewDateLapse(LocalDate from, int sizeInDays) {
        this.from = from;
        this.sizeInDays = sizeInDays;
    }

    @Override
    public LocalDate getFrom() {
        return from;
    }

    @Override
    public int sizeInDays() {
        return sizeInDays;
    }

    public LocalDate getTo(){
        return from.plusDays(sizeInDays);
    }

    public boolean includesDate(LocalDate other){
        return !other.isBefore(this.from) && !other.isAfter(this.getTo());
    }
}
