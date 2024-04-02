import java.util.Scanner;

public class SemC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        char[][] palavras = new char[10][];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra " + (i + 1) + " em letras minúsculas: ");
            palavras[i] = scanner.nextLine().toCharArray();// converte o texto digitado em caracter
        }
        
        for (int i = 0; i < 10; i++) {
            removeCaractere(palavras[i], palavras[i].length, 'c');// remove o caracter c
            System.out.println((i + 1) + " - " + new String(palavras[i]));
        }
        
        scanner.close();
    }
    
    public static int removeCaractere(char[] vetor, int tamanho, char caractere) {// removendo o caractere
        int totalRemovidos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == caractere) {
                vetor[i] = '*';
                totalRemovidos++;
            }
        }
        return totalRemovidos;
    }
}
