package org.example.exx5;

public class main {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("Nike", "Vermelha", "M", 99.90);
        Sapato sapato = new Sapato("Adidas", "Preto", "42", 199.90);
        Caixa caixa = new Caixa("Puma", "Branca", "G", 49.90);

        System.out.println(camisa.toString());
        System.out.println(sapato.toString());
        System.out.println(caixa.toString());
    }
}
