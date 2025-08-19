package org.example.exercio2;

public class veiculo {
    private String pplaca;
    private String cor;
    private int NumerodePassageiros;
    private String CapacidadeDeTanque;
    private int velocidadeMaxima;
    private double ConsumoMedio;

    public veiculo(String pplaca, String cor, int numerodePassageiros, String capacidadeDeTanque, int velocidadeMaxima, double consumoMedio) {
        this.pplaca = pplaca;
        this.cor = cor;
        NumerodePassageiros = numerodePassageiros;
        CapacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        ConsumoMedio = consumoMedio;
    }

    public String getPplaca() {
        return pplaca;
    }

    public void setPplaca(String pplaca) {
        this.pplaca = pplaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumerodePassageiros() {
        return NumerodePassageiros;
    }

    public void setNumerodePassageiros(int numerodePassageiros) {
        NumerodePassageiros = numerodePassageiros;
    }

    public String getCapacidadeDeTanque() {
        return CapacidadeDeTanque;
    }

    public void setCapacidadeDeTanque(String capacidadeDeTanque) {
        CapacidadeDeTanque = capacidadeDeTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return ConsumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        ConsumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "veiculo{" +
                "pplaca='" + pplaca + '\'' +
                ", cor='" + cor + '\'' +
                ", NumerodePassageiros=" + NumerodePassageiros +
                ", CapacidadeDeTanque='" + CapacidadeDeTanque + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", ConsumoMedio=" + ConsumoMedio +
                '}';
    }
}
