package oo1.ej12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
    private List<Pieza> piezas;

    public ReporteDeConstruccion() {
        this.piezas = new ArrayList<>();
    }

    public void addPieza(Pieza pieza){
        piezas.add(pieza);
    }

    public List<Pieza> getPiezas(){
        return new ArrayList<>(this.piezas);
    }

    public double getVolumenDeMaterial(String material){
        return piezas.stream()
                .filter(pieza -> pieza.getMaterial().equals(material))
                .mapToDouble(Pieza::getVolumen)
                .sum();
    }

    public double getSuperficieDeColor(String color){
        return piezas.stream()
                .filter(pieza -> pieza.getColor().equals(color))
                .mapToDouble(Pieza::getSuperficie)
                .sum();
    }
}
