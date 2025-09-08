package org.example.ex;

public abstract class Funcionario implements Contracao {
    protected String mome;
    protected String DataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salario;

    public Funcionario(String mome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        this.mome = mome;
        DataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Método abstrato para calcular o salário líquido

    public abstract double getsalarioLiquido();

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println( funcionario.toString() + " admitido com sucesso!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println(funcionario.toString() + " demitido");

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "mome='" + mome + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                '}';
    }
}
