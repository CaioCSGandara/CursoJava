package academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.services;

import academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain.Veiculo;

public class Calculadora {
    public static void calcularKmPorL(float litros, Veiculo v) {
        System.out.println("\nMarca + " + v.getMarca() +
                "\nModelo: " + v.getModelo() +
                "\nLitros de gasolina: " + litros +
                "\nKm percorrido: " + v.calcularKmPorL(litros));
    }
}
