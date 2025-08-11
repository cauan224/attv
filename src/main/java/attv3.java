import java.util.Scanner;

public class attv3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome= ler.nextLine();

        System.out.println("digite sua nota: ");
        double nota1= ler.nextDouble();

        System.out.println("digite a segunga nota: ");
        double nota2= ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5&& media <6.9) {
            resultado = "Verificaçao Suplementar";
        } else {
            resultado = "Reprovado";
        }

        System.out.println("\n=apresentado dadaos");
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);

        ler.close();
    }

}
