/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vladimir
 */
public class Estagiario extends Funcionario{
    private String instituicao;

    public Estagiario(String nome, String cpf, double salario,String instituicao) {
        super(nome, cpf, salario);
        this.instituicao = instituicao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getSalario() {
        return 200;
    }
    
    @Override
    public String getNome() {
        return "estagiario";
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Instituição: " + instituicao);
    }
    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
}
