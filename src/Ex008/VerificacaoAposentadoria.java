package Ex008;

import java.util.Scanner;

import java.time.Year;

public class VerificacaoAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Year.now().getValue(); 
        
        System.out.println("Sistema de Verificação de Aposentadoria");
        System.out.println("---------------------------------------");
        
        
        System.out.print("Digite o código do empregado: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();
        
        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;
        
        boolean qualificado = false;
        
        if (sexo == 'M') {
            if (idade >= 65 || tempoTrabalho >= 30) {
                qualificado = true;
            }
        } else if (sexo == 'F') {
            if (idade >= 60 || tempoTrabalho >= 25) {
                qualificado = true;
            }
        }
        
        System.out.println("\n======= Resultado =======");
        System.out.println("Código do empregado: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
        
        if (qualificado) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }
        
        scanner.close();
    }
}