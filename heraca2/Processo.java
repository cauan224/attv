package heraca2;

public class Processo extends Produto {
    private String Frequencia;

    public Processo(String marca, String modelo, String armazenamento, String frequencia) {
        super(marca, modelo, armazenamento);
        Frequencia = frequencia;
    }

    public String getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(String frequencia) {
        Frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "Frequencia='" + Frequencia + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
