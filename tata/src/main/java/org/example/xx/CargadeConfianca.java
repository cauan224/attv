package org.example.xx;

public abstract class CargadeConfianca extends funcionario {
    protected Bonificacao bonificacao;

    public CargadeConfianca(String nome, String cpf, String dataDeNascimento, Double salarioBase, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase, sexo);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
