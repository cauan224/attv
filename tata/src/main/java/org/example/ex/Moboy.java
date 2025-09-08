package org.example.ex;

public class Moboy extends Funcionario{

private String carteiraMotorista;

    public Moboy(String mome, String dataNascimento, Sexo sexo, Setor setor, double salario, String carteiraMotorista) {
        super(mome, dataNascimento, sexo, setor, salario);
        this.carteiraMotorista = carteiraMotorista;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

    @Override
    public double getsalarioLiquido() {
        return super.salario;

    }

    @Override
    public String toString() {
        return "Moboy{" +
                "carteiraMotorista='" + carteiraMotorista + '\'' +
                ", mome='" + mome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                ", salarioFinal=" + this.getSalario() +
                '}';
    }
}
