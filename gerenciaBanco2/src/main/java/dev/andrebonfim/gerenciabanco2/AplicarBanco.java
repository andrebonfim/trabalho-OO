/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.andrebonfim.gerenciabanco2;

import java.util.Scanner;

public class AplicarBanco {
    private static final double CDB_ANUAL = 0.10;
    private static final double LCI_ANUAL = 0.08;

    public void calcularInvestimentoCDB(double valor, int meses) {
        double rendimentoMensal = Math.pow(1 + CDB_ANUAL, 1.0 / 12) - 1;
        calcularRendimento(valor, meses, rendimentoMensal, "CDB");
    }

    public void calcularInvestimentoLCI(double valor, int meses) {
        double rendimentoMensal = Math.pow(1 + LCI_ANUAL, 1.0 / 12) - 1;
        calcularRendimento(valor, meses, rendimentoMensal, "LCI");
    }

    private void calcularRendimento(double valor, int meses, double rendimentoMensal, String tipo) {
        double montante = valor * Math.pow(1 + rendimentoMensal, meses);
        System.out.printf("Tipo: %s, Valor Investido: %.2f, Montante após %d meses: %.2f%n",
                tipo, valor, meses, montante);
    }

    public void iniciarInvestimento(Scanner scanner) {
        System.out.println("Escolha o tipo de investimento:");
        System.out.println("1. CDB (10% ao ano)");
        System.out.println("2. LCI (8% ao ano)");
        System.out.println("3. Sair");

        int escolha;
        while (true) {
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, escolha uma opção válida.");
                scanner.next();
            }
        }

        if (escolha == 1 || escolha == 2) {
            System.out.println("Digite o valor a ser investido:");
            double valor;
            while (true) {
                if (scanner.hasNextDouble()) {
                    valor = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um valor numérico.");
                    scanner.next();
                }
            }

            System.out.println("Digite o número de meses:");
            int meses;
            while (true) {
                if (scanner.hasNextInt()) {
                    meses = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um valor numérico para os meses.");
                    scanner.next();
                }
            }

            if (escolha == 1) {
                calcularInvestimentoCDB(valor, meses);
            } else {
                calcularInvestimentoLCI(valor, meses);
            }
        } else {
            System.out.println("Saindo do módulo de investimentos.");
        }
    }
}
