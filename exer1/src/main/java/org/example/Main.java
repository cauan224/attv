package org.example;

public class Main {
    public static void main(String[] args) {
        cliente cliente1 =new cliente("João", 30, new org.example.exercio3.Endereco("Rua A", "123", "São Paulo"));

        System.out.println(cliente1.toString());
    }
}