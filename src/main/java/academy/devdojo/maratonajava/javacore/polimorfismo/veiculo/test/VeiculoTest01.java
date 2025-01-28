package academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain.Caminhao;
import academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain.Carro;
import academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain.Moto;
import academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain.Veiculo;
import academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.services.Calculadora;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Hyundai", "HB2OS");
        Veiculo moto = new Moto("Yahama", "Fazer");
        Veiculo caminhao = new Caminhao("Wolks", "Truck3000");

        Calculadora.calcularKmPorL(10f, carro);
        Calculadora.calcularKmPorL(10f, moto);
        Calculadora.calcularKmPorL(10f, caminhao);
    }
}
