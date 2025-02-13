package academy.devdojo.maratonajava.javacore.io.test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
          br.readLine(); // le a linha inteira, diferente do FileReader que le um caracter por vez
            //retorna null depois de le todas as linhas
            String linha;
            while((linha = br.readLine())!=null) {
                System.out.println(linha);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
