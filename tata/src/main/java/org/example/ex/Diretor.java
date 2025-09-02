package org.example.ex;

public class Diretor extends Funcionario{
    private  double premio;
    public Diretor(String mome, String dataNascimento, Sexo sexo, Setor setor, double salario, double premio) {
        super(mome, dataNascimento, sexo, setor, salario);
        this.premio = premio;
    }
    public double getPremio() {
        return premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", mome='" + mome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                '}';
    }
}
