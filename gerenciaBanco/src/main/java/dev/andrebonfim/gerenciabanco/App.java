/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.andrebonfim.gerenciabanco;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();
        DadosPessoais dados = new DadosPessoais(nome, sobrenome, cpf);

        OperacoesBancarias banco = new OperacoesBancarias(dados);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar saque");
            System.out.println("4. Exibir dados do titular");
            System.out.println("5. Sair"); 
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    banco.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor para depositar:");
                    double valorDeposito = scanner.nextDouble();
                    banco.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor para sacar:");
                    double valorSaque = scanner.nextDouble();
                    banco.sacar(valorSaque);
                    break;
                case 4:
                    banco.exibirDadosTitular();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 5);
        scanner.close();
    }
}