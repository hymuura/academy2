package app.zoo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Animal primatino = new Animal("Mono", "Mamifero");
        TipoPersonal guardaBosque = new TipoPersonal("Guarda Bosque");
        TipoPersonal alimentador = new TipoPersonal("Alimentador");
        Personal pedroAlfonso = new Personal("Pedro", "Alfonso", "1234", guardaBosque);
        Personal pepGuardiola = new Personal("Pep", "Guardiola", "12345", guardaBosque);
        Personal simonPerez = new Personal("Simon", "Perez", "123456", alimentador);

        List<Personal> aldeanos = new ArrayList<>();
        aldeanos.add(pedroAlfonso);
        aldeanos.add(pepGuardiola);
        aldeanos.add(simonPerez);

        List<Animal> animales = new ArrayList<>();
        animales.add(primatino);
        animales.add(primatino);
        animales.add(primatino);



        Zoologico zoo = new Zoologico("Zoo de Lujan", animales, aldeanos);

        System.out.println(zoo.getNombre());
        System.out.println(zoo.getAnimales().size());
        System.out.println(zoo.getAldeanos().size());
        System.out.println(zoo.getAldeanos().get(0).getApellido());
    }
}
