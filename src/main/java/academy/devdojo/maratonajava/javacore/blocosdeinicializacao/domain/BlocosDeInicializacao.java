package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.domain;

public class BlocosDeInicializacao {

    private int numeros[];
    private String descricao;

    {
        numeros = new int[10];
        for(int i=0;i<10;i++) {
            numeros[i] = i;
        }
    }

    public BlocosDeInicializacao(String descricao) {
        this.descricao = descricao;
    }

    public BlocosDeInicializacao() {
        this.descricao = "Empty.";
    }

   public int[] getNumeros() {
        return this.numeros;
   }

}
