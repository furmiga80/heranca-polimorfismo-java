/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vladimir
 */
public class Gerente extends Funcionario{
    private int senha;

    public Gerente(int senha, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }
    
    @Override
    public double getBonificacao(){
        return getSalario()*15/100;
    }
    
    @Override
    public String getCargo(){
        return"gerente";
    }
    
    public boolean autentica(int senha){
        if (this.senha==senha){
            return true;
        }else{
            return false;
        }
    }
   public void setSenha(int senha){
       this.senha = senha;
   } 
}
