package org.example.xx;

public class Main {
    public static void main(String[] args) {

        Motogirl motogirl = new Motogirl("Ana", "123.456.789-00", "01/01/1990", 2000.0, Sexo.FEMININO,"ABC-1234");
        gerente gerente = new gerente("Carlos", "987.654.321-00", "02/02/1985", 5000.0, Sexo.MASCULINO,Bonificacao.GERENTE);

        System.out.println(motogirl.toString());
        System.out.println(gerente.toString());

        Direto.demitido(gerente);
    }
}
