import java.util.Scanner;

public class notaMedia {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

 

Aluno[] alunos = new Aluno[5];
  
        for (int i = 0; i < 5; i++) {

            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            String nome = scan.nextLine();

            System.out.print("Informe a primeira nota de " + nome + ": ");
            double nota1 = scan.nextDouble();

            System.out.print("Informe a segunda nota de " + nome + ": ");
            double nota2 = scan.nextDouble();

            
            // Criando um objeto Aluno
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        // Imprimindo a listagem
        System.out.println("\nListagem de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

// classe Aluno
class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método toString para imprimir os detalhes do aluno
    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota1: " + nota1 + ", Nota2: " + nota2 + ", Média: " + calcularMedia();
    }
} 