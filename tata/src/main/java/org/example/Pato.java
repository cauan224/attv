package org.example;

public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "quack quack";
    }

    @Override
    public String Comer() {
        return "peixe";
    }
}
