package org.example.ex;

public class Moboy extends Funcionario{

    private String Habitacao;

    public Moboy(String mome, String dataNascimento, Sexo sexo, Setor setor, double salario, String habitacao) {
        super(mome, dataNascimento, sexo, setor, salario);
        Habitacao = habitacao;
    }

    public String getHabitacao() {
        return Habitacao;
    }

    public void setHabitacao(String habitacao) {
        Habitacao = habitacao;
    }

    @Override
    public String toString() {
        return "Moboy{" +
                "Habitacao='" + Habitacao + '\'' +
                ", mome='" + mome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                '}';
    }
}
