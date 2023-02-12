package app;

import java.util.Date;

public class Alumno {
    //atributos
    public String nombre;
    public String apellido;
    public String dni;
    //este es un ejemplo para la clase cursada
    public Alumno alumno;

    Date fNac;
    //funciones
    public void saludar() {
        System.out.println("Me llamo " + this.nombre);
    }

    public void setApellido(String apellidoNuevo) {
        this.apellido = apellidoNuevo;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }
}
