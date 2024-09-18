package oo1.ej6;

import java.time.LocalDate;

public class Mamifero {
    private String id;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero(String id){
        this.id = id;
    }

    public Mamifero(){
        this.id = "Anonimo";
    }

    public String getIdentificador(){
        return id;
    }

    public void setIdentificador(String id){
        this.id = id;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fecha){
        this.fechaNacimiento = fecha;
    }

    public Mamifero getPadre(){
        return padre;
    }

    public void setPadre(Mamifero padre){
        this.padre = padre;
    }

    public Mamifero getMadre(){
        return madre;
    }

    public void setMadre(Mamifero madre){
        this.madre = madre;
    }

    public Mamifero getAbueloPaterno(){
        if (padre == null){
            return null;
        }
        return padre.getPadre();
    }

    public Mamifero getAbuelaPaterna(){
        if (padre == null){
            return null;
        }
        return padre.getMadre();
    }

    public Mamifero getAbueloMaterno(){
        if (madre == null){
            return null;
        }
        return madre.getPadre();
    }

    public Mamifero getAbuelaMaterna(){
        if (madre == null){
            return null;
        }
        return madre.getMadre();
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero){
        if (padre == null && madre == null){
            return false;
        }
        if (padre == unMamifero || madre == unMamifero){
            return true;
        }
        return (padre != null && padre.tieneComoAncestroA(unMamifero)) || (madre != null && madre.tieneComoAncestroA(unMamifero));
    }
}
