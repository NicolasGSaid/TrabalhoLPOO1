package Ex01;

import java.util.Scanner;

public class Tabuada {

    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número para ver sua tabuada: ");
            int numero = scanner.nextInt();

            Tabuada tabuada = new Tabuada();
            tabuada.mostrarTabuada(numero);

        scanner.close();
        
        }
    }

