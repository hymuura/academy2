package app.auto;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private Motor motor;
    private Persona dueño;

    public Auto(){}

    public Auto(String marcaNueva, String modeloNuevo, String colorNuevo, Motor motorNuevo){
        this.marca = marcaNueva;
        this.modelo = modeloNuevo;
        this.color = colorNuevo;
        this.motor = motorNuevo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
