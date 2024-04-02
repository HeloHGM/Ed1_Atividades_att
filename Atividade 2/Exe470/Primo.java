import java.util.Scanner;

public class Primo {
        public static void main(String[] args) {
            
         Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero maior q 0:");
        int num = scan.nextInt();

        int divisores = 0; // começa com zero o loop p ver quantos o num é divisivel

        for(int i = 1; i <= num; i++){// começa a dicidir por 1 e vai ate o numero digitado
          if(num % i == 0){// se resto da divisão fpr 0 add em divisores
            divisores++;
          }
        }
        if(divisores == 2){// se só tiver dois divisores extamente ele é primo
          System.out.println("o número é um número primo sim " +num );
         }else{
          System.out.println("Oo número não é um número primo " +num);
         }
         
        scan.close();
    }
    
}
