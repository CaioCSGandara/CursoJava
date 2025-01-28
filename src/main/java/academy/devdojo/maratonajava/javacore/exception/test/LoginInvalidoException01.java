package academy.devdojo.maratonajava.javacore.exception.test;

import academy.devdojo.maratonajava.javacore.exception.domain.LoginInvalidoException;

import java.util.Scanner;

//criação de exceção personalizada
//serve para melhorar leitura e manutenção do código
public class LoginInvalidoException01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Jeferson";
        String senhaDB = "12345";
        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");

    }
}
