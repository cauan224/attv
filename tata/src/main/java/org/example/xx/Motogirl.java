package org.example.xx;


public class Motogirl extends funcionario{
    private String placadamoto;

    public Motogirl(String nome, String cpf, String dataDeNascimento, Double salarioBase, Sexo sexo, String placadamoto) {
        super(nome, cpf, dataDeNascimento, salarioBase, sexo);
        this.placadamoto = placadamoto;
    }

    public String getPlacadamoto() {
        return placadamoto;
    }

    public void setPlacadamoto(String placadamoto) {
        this.placadamoto = placadamoto;
    }

    @Override
    public String toString() {
        return "Motogirl{" +
                "placadamoto='" + placadamoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public double getSalerioFinal() {
        return super.salarioBase;
    }
}
