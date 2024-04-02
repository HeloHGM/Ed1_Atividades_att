import java.util.Scanner;

public class comprimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção (1-4): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento da frase: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 2) {
                        System.out.println("Dois primeiros caracteres: " + frase.substring(0, 2));
                        System.out.println("Dois últimos caracteres: " + frase.substring(frase.length() - 2));
                    } else {
                        System.out.println("A frase é muito curta para imprimir os dois primeiros e dois últimos caracteres.");
                    }
                    break;
                case 3:
                    System.out.println("Frase espelhada: " + espelharFrase(frase));
                    break;
                case 4:
                    System.out.println("Terminando o algoritmo. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("MENU");
        System.out.println("1 - Imprime o comprimento da frase");
        System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
        System.out.println("3 - Imprime a frase espelhada");
        System.out.println("4 - Termina o algoritmo");
    }

    private static String espelharFrase(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }

}
