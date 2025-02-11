package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    // classe para manipulação de arquivos
    public static void main(String[] args) {
        File file = new File("src/main/java/academy/devdojo/maratonajava/javacore/io/test/file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Status para criar arquivo: " + isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("path absoluto: " + file.getAbsolutePath());
            System.out.println("é diretorio?: " + file.isDirectory());
            System.out.println("é arquivo?: " + file.isFile());
            System.out.println("oculto?: " + file.isHidden());
            System.out.println("ultima modificação: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        boolean exists = file.exists();

        if(exists) {
            boolean isDeleted = file.delete();
            System.out.println("Status para deletar arquivo: " + isDeleted);
        }
    }
}
