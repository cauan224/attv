package heraca2;

public class Memoria extends Produto {

    private String Capacidade;

    public Memoria(String marca, String modelo, String armazenamento, String capacidade) {
        super(marca, modelo, armazenamento);
        Capacidade = capacidade;
    }
    public String getCapacidade() {
        return Capacidade;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "Capacidade='" + Capacidade + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
