package oo1.ej13;

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
        return titulo.length() + cuerpo.length() + adjuntos().stream().mapToInt(Archivo::tamaño).sum();
    }
}
