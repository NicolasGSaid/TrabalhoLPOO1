package Ex05;

import java.util.Scanner;

public class CalcularIdade {
    
    public int calcularIdadeEmDias(int anos, int meses, int dias) {
        int totalDias = (anos * 365) + (meses * 30) + dias;
        return totalDias;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Calculadora de idade em dias");
            System.out.println("(Considerando ano com 365 dias e mês com 30 dias)");
            
            System.out.print("Digite a quantidade de anos: ");
            int anos = scanner.nextInt();
            
            
            System.out.print("Digite a quantidade de meses: ");
            int meses = scanner.nextInt();
            
            System.out.print("Digite a quantidade de dias: ");
            int dias = scanner.nextInt();
            
            if (anos < 0 || meses < 0 || meses > 11 || dias < 0 || dias > 30) {
                System.out.println("Entrada inválida. Por favor, verifique os valores:");
                System.out.println("- Anos deve ser um valor positivo");
                System.out.println("- Meses 0 deve estar entre 0 e 11");
                System.out.println("- Dias deve estar entre e 30");
            } else {
                CalcularIdade calculadora = new CalcularIdade();
                int idadeEmDias = calculadora.calcularIdadeEmDias(anos, meses, dias);
                
                System.out.println("\nA idade de " + anos + " anos, " + meses + 
                                  " meses e " + dias + " dias equivale a " + 
                                  idadeEmDias + " dias no total.");
            }
        scanner.close();
        }
    }
