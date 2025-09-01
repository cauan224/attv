package org.example.exx6;

public class Fsica extends Pessoa {
    private String cpf;
    private String rg;
    private String dataNasc;

    public Fsica(String nome, int telefone, String cpf, String rg, String dataNasc) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Fsica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
