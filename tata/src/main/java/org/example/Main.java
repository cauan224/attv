package org.example;

public class Main {
    public static void main(String[] args) {
       Cachorro cachorro = new Cachorro();
       Pato pato = new Pato();
       Gato gato = new Gato();
       Galo galo = new Galo();

        System.out.println("Cachorro faz: " + cachorro.emitirSom() + " e come " + cachorro.Comer());
        System.out.println("Pato faz: " + pato.emitirSom() + " e come " + pato.Comer());
        System.out.println("Gato faz: " + gato.emitirSom() + " e come " + gato.Comer());
        System.out.println("Galo faz : " + galo.emitirSom() + " e come " + galo.Comer());
    }

}