package Atividade5;

import java.util.Scanner;
import java.util.Stack;


public class AoContrario {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a frase: ");
    String frase = scan.nextLine(); 

    String[] palavras = frase.split("\\s+");
        
    StringBuilder resultado = new StringBuilder();

    for (String palavra : palavras) {
        
    Stack<Character> pilha = new Stack<>();


        for (char letra : palavra.toCharArray()) {

        pilha.push(letra); //push add no topo
    }
        while (!pilha.isEmpty()) {
            
        resultado.append(pilha.pop());//pop remove o do topo e mostra
    }
    resultado.append(" ");

}
    
    
        
    System.out.println("Invertido: " + resultado.toString());
    }
}
