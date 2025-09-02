package org.example.mat;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Sub sub = new Sub();
        Muiti muiti = new Muiti();
        Divivisao divivisao = new Divivisao();

        System.out.println(soma.calcular(5, 3)); // 8.0
        System.out.println(sub.calcular(5, 3)); // 2.0
        System.out.println(muiti.calcular(5, 3)); // 15.0
        System.out.println(divivisao.calcular(6, 3)); // 2.0
    }
}
