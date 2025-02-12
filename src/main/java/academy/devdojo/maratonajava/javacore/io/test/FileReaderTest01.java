package academy.devdojo.maratonajava.javacore.io.test;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)) {
            //System.out.println(fr.read()); //ascii code do primeiro caracter apenas, tem q fazer cast pra char pra ler
            int i;
            while((i=fr.read()) != -1) { //no final do arquivo, read() retorna -1
                System.out.print((char)i);
            }
//            System.out.println((char)(fr.read()) + " " + (char)(fr.read()));
            // ele le o primeiro e ja vai pro proximo, por isso o while funciona
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
