/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dev.andrebonfim.appcalculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculos calculadora = new Calculos();

        // Saudar o usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.printf("Bem-vindo, %s!%n", nome);

        int opcao = 0;
        do {
            // Exibir o menu
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Radiciação");
            System.out.println("6. Sair");

            if (!scanner.hasNextInt()) {
                scanner.next(); // descarta entrada inválida
                continue;
            }
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1Adicao = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2Adicao = scanner.nextDouble();
                    double resultadoAdicao = calculadora.adicionar(num1Adicao, num2Adicao);
                    System.out.printf("Resultado da Adição: %.2f%n", resultadoAdicao);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double num1Subtracao = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2Subtracao = scanner.nextDouble();
                    double resultadoSubtracao = calculadora.subtrair(num1Subtracao, num2Subtracao);
                    System.out.printf("Resultado da Subtração: %.2f%n", resultadoSubtracao);
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    double num1Multiplicacao = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2Multiplicacao = scanner.nextDouble();
                    double resultadoMultiplicacao = calculadora.multiplicar(num1Multiplicacao, num2Multiplicacao);
                    System.out.printf("Resultado da Multiplicação: %.2f%n", resultadoMultiplicacao);
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    double num1Divisao = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2Divisao = scanner.nextDouble();
                    double resultadoDivisao = calculadora.dividir(num1Divisao, num2Divisao);
                    System.out.printf("Resultado da Divisão: %.2f%n", resultadoDivisao);
                    break;

                case 5:
                    System.out.print("Digite um número: ");
                    double numRadiciacao = scanner.nextDouble();
                    double resultadoRadiciacao = calculadora.radiciacao(numRadiciacao);
                    System.out.printf("Resultado da Radiciação: %.2f%n", resultadoRadiciacao);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(opcao != 6);

        scanner.close();
    }
}
