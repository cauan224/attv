package org.example;

public class Main {
    public static void main(String[] args) {

        cliente c1 = new cliente("Maria", 25);


        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
    }
}