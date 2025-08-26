package heraca2;

public class Placa extends Produto {
    private String soquete;
    public Placa(String marca, String modelo, String armazenamento, String soquete) {
        super(marca, modelo, armazenamento);
        this.soquete = soquete;
    }
    public String getSoquete() {
        return soquete;
    }

    @Override
    public String toString() {
        return "Placa{" +
                "soquete='" + soquete + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
