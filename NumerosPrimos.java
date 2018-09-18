import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
                   Scanner aaa = new Scanner(System.in);
                   
                   System.out.print("Número a ser analisado: ");
                   int num = aaa.nextInt();  
                       if (num % 2 == 0 && num != 2){
                               System.out.println("Esse número é divisível por 2, portanto, não é primo.");
                       } else if (num % 3 == 0 && num != 3){
                               System.out.println("Esse número é divisível por 3, portanto, não é primo.");
                       } else if (num % 4 == 0 && num != 4){
                               System.out.println("Esse número é divisível por 4, portanto, não é primo.");
                       } else if (num % 5 == 0 && num != 5){
                               System.out.println("Esse número é divisível por 5, portanto, não é primo.");
                       } else if (num % 6 == 0 && num != 6){
                               System.out.println("Esse número é divisível por 6, portanto, não é primo.");
                       } else if (num % 7 == 0 && num != 7){
                               System.out.println("Esse número é divisível por 7, portanto, não é primo.");
                       } else if (num % 8 == 0 && num != 8){
                               System.out.println("Esse número é divisível por 8, portanto, não é primo.");
                       } else if (num % 9 == 0 && num != 9){
                               System.out.println("Esse número é divisível por 9, portanto, não é primo.");
                       } else if (num % 10 == 0 && num != 10){
                               System.out.println("Esse número é divisível por 10, portanto, não é primo.");
                       } else{
                               System.out.println("Esse número é primo.");
                       }
    }

}
