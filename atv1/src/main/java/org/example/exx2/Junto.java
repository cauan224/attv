package org.example.exx2;

public class Junto {
    public static void main(String[] args) {
      Funcionario funcionario1= new Funcionario("001","Ana Silva","Rua A, 123","(11) 98765-4321",
              " Ana13@gmail.com", new Banco("Banco do Brasil","1234","56789-0","Conta Corrente", "Ana Silva", "5000"));
        System.out.println(funcionario1.toString());

    }
}
