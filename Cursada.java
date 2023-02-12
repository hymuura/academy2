package app;

public class Cursada {
    //atributos
    public Alumno alumno;
    public String materia;

    //Constructores
    public Cursada(){}
    public Cursada(Alumno alumnoNuevo, String materiaNueva){
        this.alumno = alumnoNuevo;
        this.materia = materiaNueva;
    }

    //funciones
    public Alumno getAlumno(){
        return this.alumno;
    }

    public String getMateria(){
        return this.materia;
    }
}
