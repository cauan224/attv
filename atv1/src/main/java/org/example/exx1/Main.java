package org.example.exx1;

public class Main {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("João", 30, new Pet("Rex", 5, "Labrador"));
        System.out.println(cliente1.toString());
    }
}
