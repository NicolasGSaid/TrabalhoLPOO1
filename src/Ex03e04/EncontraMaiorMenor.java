package Ex03e04;

import java.util.Scanner;

public class EncontraMaiorMenor {
    public double encontrarMaior(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public double encontrarMenor(double num1, double num2, double num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite três números decimais:");
            
            System.out.print("Primeiro número: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Segundo número: ");
            double numero2 = scanner.nextDouble();
            
            System.out.print("Terceiro número: ");
            double numero3 = scanner.nextDouble();

            System.out.println("Para encontrar o maior número digite [1]");
            System.out.println("Para encontrar o menor número digite [2]");
            System.out.println("Para Sair Digite [3]");
            int opcao = scanner.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3){
                System.out.println("Digite uma opção Válida");
                System.out.println("Para encontrar o maior número digite [1]");
                System.out.println("Para encontrar o menor número digite [2]");
                System.out.println("Para Sair Digite [3]");
                opcao = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    EncontraMaiorMenor obj1 = new EncontraMaiorMenor();
                    double maior = obj1.encontrarMaior(numero1, numero2, numero3);
                    System.out.println("\nO maior número é: " + maior);
                    break;
                
                case 2:
                    EncontraMaiorMenor obj2 = new EncontraMaiorMenor();
                    double menor = obj2.encontrarMenor(numero1, numero2, numero3);
                    System.out.println("\nO menor número é: " + menor);
                    break;
                
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
            }
        scanner.close();
    }  
}

