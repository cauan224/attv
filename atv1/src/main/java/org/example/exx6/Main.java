package org.example.exx6;

public class Main {
    public static void main(String[] args) {
        Fsica fsica = new Fsica("João", 123456789, "123.456.789-00", "MG-12.345.678", "01/01/1990");
        Jurica jurica = new Jurica("Empresa XYZ", 987654321, "12.345.678/0001-00", "123.456.789.000");

        System.out.println(fsica.toString());
        System.out.println(jurica.toString());
    }
}
