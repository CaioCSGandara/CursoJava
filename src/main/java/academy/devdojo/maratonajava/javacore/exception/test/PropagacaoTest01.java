package academy.devdojo.maratonajava.javacore.exception.test;

public class PropagacaoTest01 {

    public void conexaoDB() {
        int x = 10;
        if(x==10) throw new IllegalArgumentException("Problema no servidor. Não foi possível salvar os dados");
    }

    public void createRegistro() {

        try {
            conexaoDB();
            int div = 10/0;
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
        catch (RuntimeException e) {
            throw new RuntimeException("Erro: tentativa de divisão por 0");
        }
    }

    public void endpoint() {
        try {
            createRegistro();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new PropagacaoTest01().endpoint();
    }
}
