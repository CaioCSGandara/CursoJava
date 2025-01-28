package academy.devdojo.maratonajava.javacore.exception.test;

import academy.devdojo.maratonajava.javacore.exception.domain.Carro;

public class Test01 {
    public static void main(String[] args) {

// // 1. Acessando o atributo message de uma RunTimeException
//            Carro c = new Carro("Gol quadrado", "1987");
//            try {
//                float r = c.kmPorL(21f);
//            }
//            catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }

//        // 2. Forçando um ArrayStoreException
//        Object x[] = new String[3];
//        x[0] = new Integer(0);


//        // 3. Acessando a mensagem de erro do mesmo objeto acima
//        // não tem mensagem, pois não fomos nós que demos o throw
//        try {
//            Object x[] = new String[3];
//            x[0] = new Integer(0);
//        }
//        catch (ArrayStoreException e) {
//            System.out.println(e.getMessage());
//        }

        //4. Forçando o mesmo erro descrito acima dentro de uma função
        //Assim, nós jogamos o throw com uma mensagem personalizada caso o erro aconteça

        Carro c = new Carro("Gol quadrado", "1987");
        try {
            c.forcandoArrayStoreException();
        }
        catch (ArrayStoreException e) {
            System.out.println(e.getMessage());
        }
        }
    }

