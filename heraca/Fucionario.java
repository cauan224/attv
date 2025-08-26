package heraca;

public class Fucionario extends Pessoa {

    private String Matricula;
    private String cargo;

    private Double Salario;

    public Fucionario(String nome, int idade, String matricula, String cargo, Double salario) {
        super(nome, idade);
        Matricula = matricula;
        this.cargo = cargo;
        Salario = salario;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Fucionario{" +
                "Matricula='" + Matricula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", Salario=" + Salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
