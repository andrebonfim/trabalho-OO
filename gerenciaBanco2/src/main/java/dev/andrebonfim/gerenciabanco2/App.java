/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.andrebonfim.gerenciabanco2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();
        AplicarBanco aplicacao = new AplicarBanco();

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();
        DadosPessoais dados = new DadosPessoais(nome, sobrenome, cpf);

        System.out.printf("Bem-vindo, %s %s!%n", nome, sobrenome);

        int opcao = 0;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Transações comuns");
            System.out.println("2. Investimentos");
            System.out.println("3. Sair");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("\n1. Verificar saldo");
                    System.out.println("2. Depositar valor");
                    System.out.println("3. Retirar valor");
                    if (!scanner.hasNextInt()) {
                        scanner.next();
                        continue;
                    }
                    int transacao = scanner.nextInt();
                    scanner.nextLine();

                    switch (transacao) {
                        case 1:
                            conta.consultarSaldo();
                            break;
                        case 2:
                            System.out.println("Digite o valor para depositar:");
                            if (!scanner.hasNextDouble()) {
                                scanner.next();
                                continue;
                            }
                            double valorDeposito = scanner.nextDouble();
                            scanner.nextLine();
                            conta.depositar(valorDeposito);
                            break;
                        case 3:
                            System.out.println("Digite o valor para retirar:");
                            if (!scanner.hasNextDouble()) {
                                scanner.next();
                                continue;
                            }
                            double valorRetirar = scanner.nextDouble();
                            scanner.nextLine();
                            conta.sacar(valorRetirar);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    aplicacao.iniciarInvestimento(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 3);
        scanner.close();
    }
}
