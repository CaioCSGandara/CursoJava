package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //obs: passou o do zoro pq nao usamos delimitador, apenas encontramos padrao
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail "; // nao considera novamente indices ja encontrados
        System.out.println("Email valido: ");
        System.out.println("#@!zoro@mail.br".matches(regex)); //por isso aqui da false
        Pattern pattern = Pattern.compile(regex); //passa o pattern para a classe Pattern
        Matcher matcher = pattern.matcher(texto2); //mostra para a classe onde vc quer achar o padrao
        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+ regex);
        System.out.println("Posicoes encontradas");

        while(matcher.find()) {
            System.out.println(matcher.start()+" " + matcher.group() + "\n"); // encontra onde começa o padrao no texto
        }

    }
}
