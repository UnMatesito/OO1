package oo1.ej22;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> archivos;

    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.archivos = new ArrayList<>();
    }

    public void addArchivo(Archivo archivo){
        this.archivos.add(archivo);
    }

    public String getTitulo(){
        return titulo;
    }

    public String getCuerpo(){
        return cuerpo;
    }

    public List<Archivo> adjuntos(){
        return new ArrayList<>(archivos);
    }

    public int tamaño(){
        return titulo.length() + cuerpo.length() + adjuntos().stream().mapToInt(archivo -> archivo.tamaño()).sum();
    }

    public Email buscar(String texto){
        if (this.titulo.contains(texto) || this.cuerpo.contains(texto)){
            return this;
        } else {
            return null;
        }
    }

    public String emailPequeño(){
        if (this.tamaño() >= 0 && this.tamaño() <= 300){
            return "Pequeño";
        } return "";
    }

    public String emailMediano(){
        if (this.tamaño() >= 301 && this.tamaño() <= 500) {
            return "Mediano";
        } return "";
    }

    public String emailGrande(){
        if (this.tamaño() >=501){
            return "Grande";
        }
        return "";
    }

}
