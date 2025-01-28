package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.domain;

public class BlocosDeInicializacaoStatic {

    private static int numeros[];
    private String descricao;

    static {
        System.out.println("BlocosDeInicializacaoStatic");
        numeros = new int[10];
        for(int i=0;i<10;i++) {
            numeros[i] = i;
        }
    }

    public BlocosDeInicializacaoStatic(String descricao) {
        this.descricao = descricao;
    }

    public BlocosDeInicializacaoStatic() {
        this.descricao = "Empty.";
    }

    public int[] getNumeros() {
        return this.numeros;
    }

}
