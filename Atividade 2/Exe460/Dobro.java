import java.util.Scanner;

public class Dobro {


    public static void main(String[] args) {
      
        for( int i=0; i<3; i++){
            Scanner scan = new Scanner(System.in);

            System.out.println("digite um numero: ");
            int num  = scan.nextInt();

            int dobro = num*2;
            System.out.println("o dobro é: " + dobro);

            scan.close();

        }
    }
    
}
