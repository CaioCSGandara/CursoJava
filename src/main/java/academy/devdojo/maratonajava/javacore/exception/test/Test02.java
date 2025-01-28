package academy.devdojo.maratonajava.javacore.exception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Test02 {
    public static void main(String[] args) {
        // Tratando múltiplas exceções
        // Caso de uso: req http (tratar diferentes códigos de erro)

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RunTimeException");
            // as mais genéricas devem vir mais embaixo
            // por conta de polimorfismo. já que as outras acima herdam de RunTimeException
        }

        try {
            talvezLanceException();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //para exceções que NAO estao na mesma linha de herança
        //podemos usar multi-catch em linha
        //garante melhor legibilidade ao código
        //ideal seria colocar exceções de mesmo tratamento no multi catch
        //e exceção generica em outro catch embaixo

        try {
            talvezLanceException();
        }
        catch(SQLException | FileNotFoundException e) { //nao poderia colocar IOException, por exemplo, pois é da mesma linhda de herança
            e.printStackTrace();
        }

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
