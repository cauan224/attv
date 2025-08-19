package org.example.exercio1;

public class Principal {
    public static void main(String[] args) {

        //Instanciar as classes pet1 e pet2
        pet1 p1= new pet1("thor", "vira-lata", 3, "medio", "ração");
        pet2 p2= new pet2("luna", "poodle", 2, "pequeno", "ração");

        //Mostrando os valores
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
