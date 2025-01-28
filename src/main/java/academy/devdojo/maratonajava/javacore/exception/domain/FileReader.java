package academy.devdojo.maratonajava.javacore.exception.domain;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
        try{
            String line;
            while((line = reader.readLine())!=null) {
                System.out.println(line);
            }
        }
        catch (IOException e ) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
