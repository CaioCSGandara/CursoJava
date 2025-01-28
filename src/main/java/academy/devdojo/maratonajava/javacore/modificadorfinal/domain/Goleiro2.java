package academy.devdojo.maratonajava.javacore.modificadorfinal.domain;

public class Goleiro2 {
    private String nome;
    private String clube;
    private int gols;

    public static final Goleiro2 ARTILHEIRO = new Goleiro2("Rogeio Ceni", "São Paulo", 131);

    public Goleiro2(String nome, String clube, int gols) {
        this.nome = nome;
        this.clube = clube;
        this.gols = gols;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public String getNome() {
        return nome;
    }

    public String getClube() {
        return clube;
    }

    public int getGols() {
        return gols;
    }
}