package Ex06;

public class EstatisticasEleicao {
    
    String municipio = "Bauru";
    int totalEleitores = 1000;
    int votosBrancos = 250;
    int votosNulos = 250;
    int votosValidos = 500;
    
    public void calcularEExibirEstatisticas() {
        double porcentagemBrancos = (double) votosBrancos / totalEleitores * 100;
        double porcentagemNulos = (double) votosNulos / totalEleitores * 100;
        double porcentagemValidos = (double) votosValidos / totalEleitores * 100;
        
        System.out.println("\n+-----------------------+-----------------------+");
        System.out.printf("| %-21s | %-21s |\n", "Município", municipio);
        System.out.println("+-----------------------+-----------------------+-----------------------+");
        System.out.printf("| %-21s | %-21s | %-21s |\n", "Totais", "Quantidade", "Porcentagem");
        System.out.println("+-----------------------+-----------------------+-----------------------+");
        System.out.printf("| %-21s | %-21d | %-20.2f%% |\n", "Eleitores", totalEleitores, 100.0);
        System.out.printf("| %-21s | %-21d | %-20.2f%% |\n", "Votos em branco", votosBrancos, porcentagemBrancos);
        System.out.printf("| %-21s | %-21d | %-20.2f%% |\n", "Votos nulos", votosNulos, porcentagemNulos);
        System.out.printf("| %-21s | %-21d | %-20.2f%% |\n", "Votos válidos", votosValidos, porcentagemValidos);
        System.out.println("+-----------------------+-----------------------+-----------------------+");
    }
    
    public static void main(String[] args) {
            EstatisticasEleicao eleicao = new EstatisticasEleicao();
            System.out.println("=== Sistema de Estatísticas Eleitorais ===");
            eleicao.calcularEExibirEstatisticas();   
    }
}