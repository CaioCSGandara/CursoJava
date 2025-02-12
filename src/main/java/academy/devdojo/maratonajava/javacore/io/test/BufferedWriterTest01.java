package academy.devdojo.maratonajava.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        //muito parecido com a FileWriter
        //porem, BufferedWriter é melhor em performance
        //file é passado para fw, fw é passado para bw
        //vai guardar os caracteres dentro de um buffer
        //cuidado com usar o \n -> bw já tem um metodo para pular linha
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Testando BufferedReader");
            bw.newLine();
            bw.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
