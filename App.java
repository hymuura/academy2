package app;

public class App {
    public static void main(String[] args) {
        //instancia de un objeto
        Alumno a1 = new Alumno();
        a1.nombre = "Jose Roberto";
        a1.dni = "1234";

        a1.saludar();
        a1.setApellido("Perez");
        System.out.println(a1.getApellido());

        String materiaNueva = "matematica";
        Cursada c1 = new Cursada();
        c1.materia = materiaNueva;
        System.out.println(c1.getMateria());

        System.out.println("************************************************");
        Cursada c2 = new Cursada(a1, materiaNueva);
        System.out.println(c2.getMateria());
        System.out.println(c2.getAlumno().getNombre());
        System.out.println(c2.getAlumno().apellido);
        System.out.println("************************************************");
    }
}
