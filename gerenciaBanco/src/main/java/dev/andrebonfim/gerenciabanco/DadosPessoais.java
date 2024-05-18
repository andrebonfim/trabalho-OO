/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.andrebonfim.gerenciabanco;

public class DadosPessoais {
    private String nome;
    private String sobrenome;
    private String cpf;

    public DadosPessoais(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " " + sobrenome + ", CPF: " + cpf;
    }
}