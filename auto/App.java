package app.auto;

import app.zoo.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Date fechaCreacionMotor = new Date("10/10/2022");
        Motor motorFuego = new Motor("Fuego", fechaCreacionMotor, 1, 2, 3, 4);

        Auto etios = new Auto("Toyota", "Etios", "gris", motorFuego);

        Persona podicia = new Persona("Pedro", "1234", "Alfonso", etios);

        System.out.println(podicia.getNombre());
        System.out.println(podicia.getAuto().getMarca());
        System.out.println(podicia.getAuto().getMotor().getMarca());
    }
}
