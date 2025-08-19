package org.example.exercio2;

public class Junto {
    public static void main(String[] args) {
        veiculo vei1 =new veiculo("ABC1234", "Vermelho", 5, "50L", 180, 15.0);
        Livro liv1 = new Livro("luis ó jack", "Luis Henrique", 300, 100);
        Cliente cli1 = new Cliente("João Silva", 30, "123.456.789-00", "Rua A, 123", 987654321);

        System.out.println(vei1.toString());
        System.out.println(liv1.toString());
        System.out.println(cli1.toString());
    }



}

