package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class lista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resporta;
        do {
            System.out.println("digite uma nota: ");
            notas.add(ler.nextDouble());
            System.out.println("Deseja adicionar mais uma nota?");
            System.out.println("Precione o n para sair");
            resporta = ler.next();

        }while (!resporta.equalsIgnoreCase("n"));
        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("nota: " + nota);
        }
    }
}
