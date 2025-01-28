package academy.devdojo.maratonajava.javacore.polimorfismo.veiculo.domain;

public abstract class Veiculo implements CalculaKmPorL{

    protected String marca;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    protected String modelo;

    public abstract float calcularKmPorL(float litros);
}
