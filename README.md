ackage org.example;

public class operador {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silva";

        // Exibindo a quantidade de caracteres em cada string

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        // Exibindo o nome e sobrenome concatenados

        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo o nome completo usando metodo String-Maiuscula

        System.out.println("cocatenaçao maiuscula: " + nomeCompleto.toUpperCase());

        // Exibindo o nome completo usando metodo String-Minuscula

        System.out.println("cocatenaçao minuscula: " + nomeCompleto.toLowerCase());
    }
}
