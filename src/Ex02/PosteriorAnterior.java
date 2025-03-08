
package Ex02;

import java.util.Scanner;

public class PosteriorAnterior {
    
    public void Ex002(int numero) {

        System.out.println("\n\nNúmero escolhido: " + numero + "\n");

        System.out.println("50 números anteriores a " + numero + ":");

        System.out.println();
        
        for (int i = numero - 50; i < numero; i++) {
            System.out.print(i + " ");

            if ((i - (numero - 50) + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("50 números posteriores a " + numero + ":");

        System.out.println();
        for (int i = numero + 1; i <= numero + 50; i++) {
            System.out.print(i + " ");
             
            if ((i - (numero + 1) + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            PosteriorAnterior obj = new PosteriorAnterior();
            obj.Ex002(numero);
            
        scanner.close();
        } 
    }
    
