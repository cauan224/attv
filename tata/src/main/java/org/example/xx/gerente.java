package org.example.xx;

public class gerente extends CargadeConfianca  {
    public gerente(String nome, String cpf, String dataDeNascimento, Double salarioBase, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase, sexo, bonificacao);
    }

    @Override
    public String toString() {
        return "gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + getSalerioFinal() +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public double getSalerioFinal() {
        return super.salarioBase + (super.salarioBase * bonificacao.getFator());
    }
}
