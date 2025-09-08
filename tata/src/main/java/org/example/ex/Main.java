package org.example.ex;

public class Main {
    public static void main(String[] args) {
        Moboy moboy = new Moboy("João", "01/01/1990", Sexo.MASCULINO, Setor.OPERACOES, 2000.0, "123456");
        Diretor diretor = new Diretor("Maria", "02/02/1980", Sexo.FEMININO,Setor.FINANCEIRO, 5000.0);

        System.out.println(moboy.toString());
        System.out.println(diretor.toString());

        diretor.admitir(moboy);


    }
}
