package Exe351;
import java.util.Scanner;


public class nomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Armazenar cinco nomes em um vetor
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicitar um número correspondente a uma pessoa
        System.out.print("Digite um número correspondente a uma pessoa (1-5): ");
        int numeroPessoa = scanner.nextInt();

        // Verificar se o número está dentro do intervalo válido
        if (numeroPessoa >= 1 && numeroPessoa <= 5) {
            // Imprimir o nome da pessoa correspondente
            System.out.println("Nome da pessoa " + numeroPessoa + ": " + nomes[numeroPessoa - 1]);
        } else {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 5.");
        }

        scanner.close();
    }
}


