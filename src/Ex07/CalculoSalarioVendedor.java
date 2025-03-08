package Ex07;

import java.util.Scanner;

public class CalculoSalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo de Salário - Revendedora de Carros Usados");
        System.out.println("-------------------------------------------------");
        
        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        
        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();
        
        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor recebido por carro vendido: R$ ");
        double valorPorCarro = scanner.nextDouble();
        
    
        double comissaoFixa = carrosVendidos * valorPorCarro;
        double comissaoPercentual = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;
        
        System.out.println("\n======= Resultado =======");
        System.out.println("Salário fixo: R$ " + String.format("%.2f", salarioFixo));
        System.out.println("Comissão por carros vendidos: R$ " + String.format("%.2f", comissaoFixa));
        System.out.println("Comissão percentual (5% das vendas): R$ " + String.format("%.2f", comissaoPercentual));
        System.out.println("---------------------------------");
        System.out.println("Salário final: R$ " + String.format("%.2f", salarioFinal));
        
        scanner.close();
    }
}