package academy.devdojo.maratonajava.javacore.exception.test;

import academy.devdojo.maratonajava.javacore.exception.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.exception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        //para executar o metodo sobrescrito, nao foi necessario declarar as mesmas exceções
        //isso pois ao sobrescrever, o comportamento do metodo pode mudar
        funcionario.salvar();
    }
}
