package academy.devdojo.maratonajava.javacore.classenum.test;

import academy.devdojo.maratonajava.javacore.classenum.domain.Location;
import academy.devdojo.maratonajava.javacore.classenum.domain.Race;

import java.util.Date;


public class Test01 {
    public static void main(String[] args) {

        Race race = new Race(new Date(), Location.CAMPINAS, Location.CAMPINAS.calcularValorIngresso());

        System.out.println(race);
        System.out.println(Location.CAMPINAS.getEstado());
    }
}
