package heraca2;

public class Armazenamento  extends Produto {
    private String tipoDeconexao;

    public Armazenamento(String marca, String modelo, String armazenamento, String tipoDeconexao) {
        super(marca, modelo, armazenamento);
        this.tipoDeconexao = tipoDeconexao;
    }

    public String getTipoDeconexao() {
        return tipoDeconexao;
    }

    public void setTipoDeconexao(String tipoDeconexao) {
        this.tipoDeconexao = tipoDeconexao;
    }

    @Override
    public String toString() {
        return "Armazenamento{" +
                "tipoDeconexao='" + tipoDeconexao + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
