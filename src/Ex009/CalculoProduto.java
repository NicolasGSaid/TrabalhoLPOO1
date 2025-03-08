package Ex009;

import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo de Preço com Desconto");
        System.out.println("----------------------------");
        
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        
        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();
        
        System.out.print("Digite o preço unitário: R$ ");
        double precoUnitario = scanner.nextDouble();
        
        double total = quantidade * precoUnitario;
        
        double percentualDesconto;
        
        if (quantidade <= 5) {
            percentualDesconto = 0.02; 
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03; 
        } else {
            percentualDesconto = 0.05; 
        }
        
        double valorDesconto = total * percentualDesconto;
        double totalPagar = total - valorDesconto;
        
        System.out.println("\n===== Resultado =====");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + String.format("%.2f", precoUnitario));
        System.out.println("Total: R$ " + String.format("%.2f", total));
        System.out.println("Desconto (" + (percentualDesconto * 100) + "%): R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Total a pagar: R$ " + String.format("%.2f", totalPagar));
        
        scanner.close();
    }
}