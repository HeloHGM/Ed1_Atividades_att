import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int x;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        x = reverso(num);
        System.out.println("\n" + num + " - " + x);
        if (x == num) {
            System.out.println("\nÉ um número capicua.");
        } else {
            System.out.println("\nNão é um número capicua.");
        }
        System.out.println();
        scanner.close();
    }

    public static int reverso(int num) {
        int soma = 0;
        int r;
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
        
}
