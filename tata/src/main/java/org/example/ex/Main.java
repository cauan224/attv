package org.example.ex;

public class Main {
    public static void main(String[] args) {
        Moboy moby = new Moboy("Carlos", "25", Sexo.MASCULINO, Setor.OPERACOES, 1500.0,"Carteiro b");

        Diretor diretor = new Diretor("Ana", "30", Sexo.FEMININO, Setor.FINANCEIRO, 8000.0, 12000.0);

        System.out.println(moby.toString());
        System.out.println(diretor.toString());
    }
}
