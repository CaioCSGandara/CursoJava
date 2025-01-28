package academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain;

public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public float calcularKmPorL(float litros) {
        return 2.5f * litros;
    }
}
