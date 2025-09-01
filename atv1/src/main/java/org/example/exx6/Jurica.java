package org.example.exx6;

public class Jurica extends Pessoa{
    private String cnpj;
    private String ie;

    public Jurica(String nome, int telefone, String cnpj, String ie) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return "Jurica{" +
                "cnpj='" + cnpj + '\'' +
                ", ie='" + ie + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
