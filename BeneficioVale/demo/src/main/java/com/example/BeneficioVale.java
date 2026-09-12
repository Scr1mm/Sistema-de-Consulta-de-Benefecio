package com.example;

import java.util.Scanner;

public class BeneficioVale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        if (salario <= 4000.00) {
            System.out.println("O funcionário possui direito ao vale refeição.");
        } else {
            System.out.println("O funcionário não possui direito ao vale refeição.");
        }

        scanner.close();
    }
}

class ConsultaBeneficios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de empresa (em anos): ");
        int tempoEmpresa = scanner.nextInt();

        System.out.print("Digite a quantidade de filhos: ");
        int qtdFilhos = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite a modalidade de trabalho (presencial / home office): ");
        String modalidade = scanner.nextLine().trim();

        System.out.print("Utiliza veículo próprio? (sim / nao): ");
        String veiculoProprio = scanner.nextLine().trim();

        
       
        boolean valeAlimentacao = salario <= 4000.00;
        boolean auxilioCreche = qtdFilhos > 0;     
        boolean planoSaude = tempoEmpresa >= 0;
        boolean auxilioHomeOffice = modalidade.equalsIgnoreCase("home office");
        boolean auxilioCombustivel = modalidade.equalsIgnoreCase("presencial") && veiculoProprio.equalsIgnoreCase("sim");
        boolean plr = tempoEmpresa >= 1;
        boolean bolsaEstudos = tempoEmpresa >= 2;

      
        System.out.println("\n----------------------------------------");
        System.out.println("  SISTEMA DE CONSULTA DE BENEFÍCIOS");
        System.out.println("----------------------------------------");
        System.out.println("Colaborador: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("----------------------------------------");
        System.out.println("Vale-Alimentação: " + (valeAlimentacao ? "Possui direito" : "Não possui direito"));
        System.out.println("Auxílio-Creche: " + (auxilioCreche ? "Possui direito" : "Não possui direito"));
        System.out.println("Plano de Saúde: " + (planoSaude ? "Elegível" : "Não elegível"));
        System.out.println("Auxílio Home Office: " + (auxilioHomeOffice ? "Possui direito" : "Não possui direito"));
        System.out.println("Auxílio Combustível: " + (auxilioCombustivel ? "Possui direito" : "Não possui direito"));
        System.out.println("Participação na PLR: " + (plr ? "Possui direito" : "Não possui direito"));
        System.out.println("Bolsa de Estudos: " + (bolsaEstudos ? "Elegível" : "Não elegível"));
        System.out.println("----------------------------------------");

        scanner.close();
    }
}