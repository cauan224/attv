package org.example.exx2;

public class Banco {
    private String nome;
    private String agencia;
    private String numero;
    private String tipoConta;
    private String string;
    private String Limite;

    public Banco(String nome, String agencia, String numero, String tipoConta, String string, String limite) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.tipoConta = tipoConta;
        this.string = string;
        Limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getLimite() {
        return Limite;
    }

    public void setLimite(String limite) {
        Limite = limite;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numero='" + numero + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", string='" + string + '\'' +
                ", Limite='" + Limite + '\'' +
                '}';
    }
}


