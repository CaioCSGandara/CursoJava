package academy.devdojo.maratonajava.javacore.exception.test;

import academy.devdojo.maratonajava.javacore.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo3();
    }

    //codigo ABISSAL para ler um arquivo:
    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //resolução: try with resources
    //ele garante que a conexao da variavel de referencia sera fechada
    //o que esta neste try deve implementar Closeable ou AutoCloseable
    //entao, nao temos que usar finally
    //existe a possibilidade de tirar o catch, mas tem que por o throw no cabeçalho
    public static void lerArquivo2() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }
        catch(IOException e) {

        }
    }

    //da pra colocar várias variáveis que implementam Cloaseable/Autocloseable:
    //OBS: neste caso, são fechados na ordem INVERSA em que foram chamados

    public static void lerArquivo3() {
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
