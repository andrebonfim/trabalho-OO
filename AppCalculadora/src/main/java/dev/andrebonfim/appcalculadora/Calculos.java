/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.andrebonfim.appcalculadora;

public class Calculos {
    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;
        }
    }

    public double radiciacao(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Erro: Número negativo não tem raiz quadrada real.");
            return Double.NaN;
        }
    }
}
