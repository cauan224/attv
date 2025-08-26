public class Endereco {
    private String logadouro;
    private String numero;
    private String complement;
    private String cidade;
    private Uf uf;
    private String cep;

    public Endereco(String logadouro, String numero, String complement, String cidade, Uf uf, String cep) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complement = complement;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logadouro='" + logadouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complement='" + complement + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf=" + uf.getSigla() +
                ", uf=" + uf.getNome() +
                ", cep='" + cep + '\'' +
                '}';
    }
}
