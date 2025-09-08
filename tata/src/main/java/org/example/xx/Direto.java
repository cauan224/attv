package org.example.xx;

public class Direto extends CargadeConfianca implements Contrato {
    private double premio= 1.1;

    public Direto(String nome, String cpf, String dataDeNascimento, Double salarioBase, Sexo sexo, Bonificacao bonificacao, double premio) {
        super(nome, cpf, dataDeNascimento, salarioBase, sexo, bonificacao);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Direto{" +
                "premio=" + premio +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public void admitir(funcionario funcionario) {

    }

    @Override
    public void demitir(funcionario funcionario) {

    }

    @Override
    public double getSalerioFinal() {
        return 0;
    }
}
