/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vladimir
 */
public abstract class Funcionario {
    private final String nome;
    private final String cpf;
    private final double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    public abstract double getBonificacao();
    public abstract String getCargo();
    
    public void exibirDados() {
        
        System.out.println("Cargo: " + getCargo());
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bonficacao" + getBonificacao());
        
    }

    
    
}
