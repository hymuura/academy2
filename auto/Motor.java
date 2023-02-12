package app.auto;

import java.util.Date;

public class Motor {
    private String marca;
    private Date fechaCreacion;
    private int caballos;
    private int pistones;
    private int valvulas;
    private int bujias;

    public Motor(String marca, Date fechaCreacion, int caballos, int pistones, int valvulas, int bujias) {
        this.marca = marca;
        this.fechaCreacion = fechaCreacion;
        this.caballos = caballos;
        this.pistones = pistones;
        this.valvulas = valvulas;
        this.bujias = bujias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getPistones() {
        return pistones;
    }

    public void setPistones(int pistones) {
        this.pistones = pistones;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public int getBujias() {
        return bujias;
    }

    public void setBujias(int bujias) {
        this.bujias = bujias;
    }
}
