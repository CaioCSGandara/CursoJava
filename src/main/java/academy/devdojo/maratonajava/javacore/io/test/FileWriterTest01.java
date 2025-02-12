package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        //classe específica para escrever em arquivos
        //pacote io tem classes para cada funcionalidade especifica
        //classes costumam se encadear no pacote io
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);) {
            fw.write("Escrevendo no arquivo");
            //metodo sobrecarregado
            //escrever em arquivo usa recurso do SO
            fw.flush();//"cuspir" tudo que tem dentro do buffer
            //serve para caso fechar o arquivo antes de finalizar
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
