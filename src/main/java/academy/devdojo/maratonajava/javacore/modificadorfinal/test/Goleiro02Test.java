package academy.devdojo.maratonajava.javacore.modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.modificadorfinal.domain.Goleiro2;

public class Goleiro02Test {

    public static void main(String[] args) {
        System.out.println(Goleiro2.ARTILHEIRO.getNome() + " " + Goleiro2.ARTILHEIRO.getClube() + " " + Goleiro2.ARTILHEIRO.getGols());
        Goleiro2.ARTILHEIRO.setGols(Goleiro2.ARTILHEIRO.getGols()+1);
        System.out.println(Goleiro2.ARTILHEIRO.getNome() + " " + Goleiro2.ARTILHEIRO.getClube() + " " + Goleiro2.ARTILHEIRO.getGols());
    }
}
