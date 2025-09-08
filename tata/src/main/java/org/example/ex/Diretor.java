package org.example.ex;

public class Diretor extends Funcionario {
    private final double prmio = 0.2;

    public Diretor(String mome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        super(mome, dataNascimento, sexo, setor, salario);
    }

    public double getPrmio() {
        return prmio;
    }

    @Override
    public double getsalarioLiquido() {
        return super.salario + (super.salario * this.prmio);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "prmio=" + prmio +
                ", mome='" + mome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                ", salarioFinal=" + this.getsalarioLiquido() +
                '}';
    }


}


