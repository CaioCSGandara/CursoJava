package academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public float calcularKmPorL(float litros) {
        return 8f * litros;
    }
}
