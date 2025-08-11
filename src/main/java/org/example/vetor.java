package org.example;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i=0; i<5;i++){
            do {


                System.out.println("Digite a nota " + (i + 1) + ": ");
                notas[i] = ler.nextDouble();
            }while (notas[i] < 0 || notas[i] > 10);
        }
        System.out.println("\nExibindo as notas:");
        for (double nota : notas){
            System.out.println("notas: " + nota);
        }
        double media =(notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;
        System.out.println("\nMédia: " + media);
        ler.close();
    }
}
