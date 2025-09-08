package org.example.xx;

public enum Bonificacao {
    GERENTE( 1.3),
    DIRETOR(1.4);

    private double fator;

    Bonificacao(double fator) {
        this.fator = fator;
    }
    public double getFator() {
        return fator;
    }
}
