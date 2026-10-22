/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vladimir
 */
public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, String cpf, double salario,String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }
 @Override
    public double getBonificacao() {
        return this.getSalario() * 0.10;
    }
   
    @Override
    public String getCargo() {
        return "Programador";
    }
    
    
    }
    
    

