package app.zoo;

public class Personal {
    private String nombre;
    private String apellido;
    private String dni;
    private TipoPersonal tipoPersonal;

    public Personal(String nombre, String apellido, String dni, TipoPersonal tipoPersonal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoPersonal = tipoPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoPersonal getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(TipoPersonal tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
}
