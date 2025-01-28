package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosdeinicializacao.domain.BlocosDeInicializacao;

import java.util.Arrays;

public class BlocoDeInicializaçãoTest01 {
    public static void main(String[] args) {

        BlocosDeInicializacao b1 = new BlocosDeInicializacao();
        BlocosDeInicializacao b2 = new BlocosDeInicializacao("Produto ruim");

        System.out.println(Arrays.toString(b1.getNumeros()));
        System.out.println();
        System.out.println(Arrays.toString(b2.getNumeros()));
    }
}
