package org.example.xx;

public abstract class funcionario implements SalerioFinal {
    protected String nome;
    protected String cpf;
    protected String DataDeNascimento;
    protected Double salarioBase;
    protected Sexo sexo;

    public funcionario(String nome, String cpf, String dataDeNascimento, Double salarioBase, Sexo sexo) {
        this.nome = nome;
        this.cpf = cpf;
        DataDeNascimento = dataDeNascimento;
        this.salarioBase = salarioBase;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;


    }
    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}


