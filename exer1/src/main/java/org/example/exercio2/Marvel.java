package org.example.exercio2;

public class Marvel {
    private String nome;
    private int idade;
    private String poder;
    private String fraqueza;

    public Marvel(String nome, int idade, String poder, String fraqueza) {
        this.nome = nome;
        this.idade = idade;
        this.poder = poder;
        this.fraqueza = fraqueza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    @Override
    public String toString() {
        return "Marvel{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", poder='" + poder + '\'' +
                ", fraqueza='" + fraqueza + '\'' +
                '}';
    }
}
