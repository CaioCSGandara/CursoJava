package academy.devdojo.maratonajava.javacore.exception.domain;

public class Carro {
    String nome;
    String ano;

    public Carro(String nome, String ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float kmPorL(float litros) {
        if(litros>20) throw new IllegalArgumentException("Nao pode ser mais de 20 litros");
        return litros * 10;
    }

    public void forcandoArrayStoreException() {
        Object x[] = new String[3];
        Integer valor = 5;
        if(valor instanceof Integer) throw new ArrayStoreException("Tentou guardar Integer no vetor de String");
        x[0] = valor;
    }

    public void testandoExceptionChecked() {

    }
}
