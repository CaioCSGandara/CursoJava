package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isCriado = fileDiretorio.mkdir(); //nao vai ser criado se ja existir
        // usando caminho absoluto:
        //File fileArquivoDiretorio = new File("C:\\Users\\caioc\\OneDrive\\Documentos\\repositorios\\CursoJava\\pasta\\arquivo.txt");

        //caso exista referencia para a pasta:
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivoX.txt");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //renomear arquivo
        File arquivoRenomeado = new File(fileDiretorio, "arquivo-renomeado.txt");
        fileArquivoDiretorio.renameTo(arquivoRenomeado);


        //renomear pasta
        File diretorioRenamed = new File("pasta2");
        fileDiretorio.renameTo(diretorioRenamed);

    }
}
