package academy.devdojo.maratonajava.javacore.modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.modificadorfinal.domain.Goleiro;

public class GoleiroTest01 {
    public static void main(String[] args) {
        Goleiro marcos = new Goleiro("Marcos", "Palmeiras", 140);

        System.out.println((marcos.getGols() > Goleiro.MAXIMO_GOLS)?"Quebrou o record":"Nao quebrou o record");
    }
}
