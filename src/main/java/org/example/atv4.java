package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class atv4 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(8.0);

        for (double nota : notas) {
            System.out.println("notas: " + nota);
        }

    }
}

