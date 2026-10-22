/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
    import model.Diretor;
    import model.Estagiario;
    import model.Funcionario;
    import model.Gerente;
    import model.Programador;
    import Services.ControleDeBonificacao;
    import java.util.ArrayList;
/**
 *
 * @author vladimir
 */
public class ProgramaFuncionario {
   public static void main(String[]args){
       
       Programador programador = new Programador ("Ana","013.013.013-13", 4000,"java");
       Gerente gerente = new Gerente(2000,"Davi","000.000.000-01",1500);
       Diretor diretor = new Diretor(3000,"Bruno","000.000.000-02",6000);
       Estagiario estagiario = new Estagiario("Carla","000.000.000-22", 10000);
       
       ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(programador);
        lista.add(gerente);
        lista.add(diretor);
        lista.add(estagiario);
        
        ControleDeBonificacao controle = new ControleDeBonificacao;
       
       
   }
    
   
    
}
