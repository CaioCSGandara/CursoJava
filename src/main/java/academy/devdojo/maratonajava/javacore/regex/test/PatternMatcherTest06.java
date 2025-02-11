package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest06 {
    public static void main(String[] args) {
        //regex = linguagem baseada em metacaracteres
        //serve para fazer buscas complexas e também validações

        // \d = Todos os digitos
        // \D = Tudo que nao for dígito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = tudo que nao for espaço em branco
        // \w = a-z A-Z, digitos, _
        // \W tudo o que não for incluso no \w
        // [] RANGE

        //QUANTIFICADORES:
        // ? zero ou uma
        // * 0 ou mais
        // + uma ou mais
        // {n, m} de n até m
        // ()
        // | o(v|o)0 -> ovo ou oco
        // $ fim da linha

        //. caracater coringa -> 1.3 -> 1a3, 1@3, 123, 153...
        // \\ -> 2x caracter de escape pra usar no java

        //usar site: regexr.com
        //^ usado para encontrar o que vc quer no começo da linha
        //como negação, usar dentro de [] -> [^abc] = tudo q nao for a ou b ou c

        //EXERCÍCIOS:

        //1. Regex para validar e-mail
        String regexEmail = "^[a-zA-Z0-9\\._-]+@[a-zA-Z]+(\\.[a-z]+)+$";
        System.out.println("caio2@gmail.com - " + "caio@gmail.com".matches(regexEmail));
        System.out.println("juninho.010_loko@gmail.com - " + "juninho.010_loko@gmail.com".matches(regexEmail));
        System.out.println("Roberto.22@hotmail.com - " + "Roberto.22@hotmail.com".matches(regexEmail));
        System.out.println("aguilar_12@outlook..com - " + "aguilar_12@outlook..com -".matches(regexEmail));

        //2. Regex para validar CPF
        String regexCPF = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        System.out.println("503.589.548-35 - " + "503.589.548-35".matches(regexCPF));
        System.out.println("819.318.058-12 - " + "819.318.058-12".matches(regexCPF));
        System.out.println("abd-123-512-3d - " + "abd-123-512-3d".matches(regexCPF));
        System.out.println("503..589.548-35 - " + "503..589.548-35".matches(regexCPF));

        //3. Regex para validar data
        String regexDate = "^\\d{2}/\\d{2}/\\d{4}$";
        System.out.println("22/01/1999 - " + "22/01/1999".matches(regexDate));
        System.out.println("22/d1/1999 - " + "22/d1/1999".matches(regexDate));
        System.out.println("22//01/1999 - " + "22//01/1999".matches(regexDate));

        //4. Regex para validar senha
        String regexPassword = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\s]).{8,}$";
        System.out.println("Panter@8 - " + "Panter@8".matches(regexPassword));
        System.out.println("panter@8 - " + "panter@8".matches(regexPassword));
        System.out.println("Pantera8 - " + "Pantera8".matches(regexPassword));
        System.out.println("Panter@ - " + "Panter@".matches(regexPassword));



    }
}
