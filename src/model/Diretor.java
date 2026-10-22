/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vladimir
 */
public class Diretor extends Gerente{

    public Diretor(int senha, String nome, String cpf, double salario) {
        super(senha, nome, cpf, salario);
    }
    
    @Override
    public String getCargo(){
        return "diretor";
    }
    
}
