package app.auto;

public class Persona {
    private String nombre;
    private String dni;
    private String apellido;
    private Auto auto;

    public Persona(String nombreNuevo, String dniNuevo, String apellidoNuevo, Auto autoNuevo) {
        this.nombre = nombreNuevo;
        this.dni = dniNuevo;
        this.apellido = apellidoNuevo;
        this.auto = autoNuevo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
