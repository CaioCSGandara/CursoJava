package academy.devdojo.maratonajava.javacore.classenum.domain;

public enum Location {
    SÃO_PAULO(1, "SP") {
        @Override
        public float calcularValorIngresso() {
            return 199.99f;
        }
    },
    CAMPINAS(2, "SP") {
        @Override
        public float calcularValorIngresso() {
            return 99.99f;
        }
    };

    private int valor;
    private String estado;

    Location(int valor, String estado) {
        this.estado=estado;
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract float calcularValorIngresso();
}
