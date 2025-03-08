package Ex10;

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double PRECO_GASOLINA = 5.35;
        double PRECO_ETANOL = 3.79;

        System.out.println("Cálculo de Valor de Combustível");
        System.out.println("------------------------------");

        System.out.println("Digite o tipo de combustível:");
        System.out.println("[1] Gasolina");
        System.out.println("[2] Etanol");
        int tipoCombustivel = scanner.nextInt();

        while (tipoCombustivel != 1 && tipoCombustivel != 2) {
            System.out.println("Opção inválida. Digite novamente:");
            System.out.println("[1] Gasolina");
            System.out.println("[2] Etanol");
            tipoCombustivel = scanner.nextInt();
        }

        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();

        double precoLitro = 0.0;
        double percentualDesconto = 0.0;
        String nomeCombustivel = "";

        if (tipoCombustivel == 1) {
            precoLitro = PRECO_GASOLINA;
            nomeCombustivel = "Gasolina";

            if (litros <= 20) {
                percentualDesconto = 0.04;
            } else {
                percentualDesconto = 0.06;
            }
        } else {
            precoLitro = PRECO_ETANOL;
            nomeCombustivel = "Etanol";

            if (litros <= 20) {
                percentualDesconto = 0.03;
            } else {
                percentualDesconto = 0.05;
            }
        }

        double valorBruto = litros * precoLitro;
        double valorDesconto = valorBruto * percentualDesconto;
        double valorFinal = valorBruto - valorDesconto;

        System.out.println("\n===== Resumo da Compra =====");
        System.out.println("Combustível: " + nomeCombustivel);
        System.out.println("Preço por litro: R$ " + String.format("%.2f", precoLitro));
        System.out.println("Quantidade: " + String.format("%.2f", litros) + " litros");
        System.out.println("Valor bruto: R$ " + String.format("%.2f", valorBruto));
        System.out.println("Desconto (" + (percentualDesconto * 100) + "%): R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorFinal));

        scanner.close();
    }
}
