package org.example.exx7;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoEngenheiro = new Endereco("Rua A", "123", "Apto 1", "Cidade X", "12345-678");
        Engenheiro engenheiro = new Engenheiro("João Silva", "joao@gmail.com", 5000.0f, enderecoEngenheiro, "CREA12345");

        Endereco enderecoMedico = new Endereco("Rua B", "456", "Casa", "Cidade Y", "98765-432");
        Medico medico = new Medico("Maria Souza", "Maria12@gmail.com", 7000.0f, enderecoMedico, "CRM67890");

        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());
    }


}
