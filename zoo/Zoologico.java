package app.zoo;

import java.util.List;

public class Zoologico {
    private String nombre;
    private List<Animal> animales;
    private List<Personal> aldeanos;

    public Zoologico(String nombre, List<Animal> animales, List<Personal> aldeanos) {
        this.nombre = nombre;
        this.animales = animales;
        this.aldeanos = aldeanos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Personal> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(List<Personal> aldeanos) {
        this.aldeanos = aldeanos;
    }
}
