package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosdeinicializacao.domain.BlocosDeInicializacaoStatic;

import java.util.Arrays;

public class BlocoDeInicializacaoStaticTest01 {
    public static void main(String[] args) {

        BlocosDeInicializacaoStatic b1 = new BlocosDeInicializacaoStatic();
        BlocosDeInicializacaoStatic b2 = new BlocosDeInicializacaoStatic("Produto ruim");

        System.out.println(Arrays.toString(b1.getNumeros()));
        System.out.println();
        System.out.println(Arrays.toString(b2.getNumeros()));
    }
}
