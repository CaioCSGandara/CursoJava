package academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain;

public class Moto extends Veiculo {
    @Override
    public float calcularKmPorL(float litros) {
        return 30f* litros;
    }

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
}
