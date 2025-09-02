package org.example;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String Comer() {
        return "Raçao";
    }
}
