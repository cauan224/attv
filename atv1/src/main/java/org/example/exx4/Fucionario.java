package org.example.exx4;

public class Fucionario {
    private  String id;
    private  String nome;
    private  String salario;
    private  Setor setor;
    private  Sexo sexo;
    private  String Idade;

    public Fucionario(String id, String nome, String salario, Setor setor, Sexo sexo, String idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        Idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Fucionario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                ", setor=" + setor +
                ", sexo=" + sexo +
                ", Idade='" + Idade + '\'' +
                '}';
    }
}
