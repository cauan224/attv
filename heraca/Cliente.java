package heraca;

public class Cliente extends Pessoa {
    private String dataDeCompra;
    private String FormaDePagamneto;


    public Cliente(String nome, int idade, String dataDeCompra, String formaDePagamneto) {
        super(nome, idade);
        this.dataDeCompra = dataDeCompra;
        FormaDePagamneto = formaDePagamneto;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormaDePagamneto() {
        return FormaDePagamneto;
    }

    public void setFormaDePagamneto(String formaDePagamneto) {
        FormaDePagamneto = formaDePagamneto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataDeCompra='" + dataDeCompra + '\'' +
                ", FormaDePagamneto='" + FormaDePagamneto + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
