package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        //TOKENS E DELIMITADORES
        //servem para manipular uma string array-like (ou com qualquer tipo de espaçamento)
        //oferece uma maneira de escolher o separador, acessar os elementos e ate mesmo a tipagem deles

        //uso de token e delimitação com String
        String texto = "Levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        for (String nome: nomes) {
            System.out.println(nome.trim());
        }
        //caso tenha outro tipo alem de string:
        String texto2 = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto2);
        scanner.useDelimiter(",");

        while(scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int: " + i);
            }
            else if(scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            }
            else {
                System.out.println(scanner.next());
            }
        }
    }
}
