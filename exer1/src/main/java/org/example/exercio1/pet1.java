package org.example.exercio1;

public class pet1 {

    private String noeme;
    private String raca;
    private int idade;
    private String porte;
    private String alimentacao;


    public pet1(String noeme, String raca, int idade, String porte, String alimentacao) {
        this.noeme = noeme;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }


    public String getNoeme() {
        return noeme;
    }

    public void setNoeme(String noeme) {
        this.noeme = noeme;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "pet1{" +
                "noeme='" + noeme + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", porte='" + porte + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }
}


