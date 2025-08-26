public enum Uf {
    BAHIA("Bahia","BA"),
    SAO_PAULO("Sao paulo","Sp"),
    RIO_DE_JANEIRO("Rio de janeiro","RJ");

    private String nome;
    private String sigla;

    Uf(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
