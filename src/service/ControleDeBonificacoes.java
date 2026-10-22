/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.Funcionario;
/**
 *
 * @author vladimir
 */
public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;
    public void registra(Funcionario f){
    totalDeBonificacoes = totalDeBonificacoes + f.getBonificacao();
}
    public double getTotalDeBonificacoes(){
        return totalDeBonificacoes;
    }
    
}
