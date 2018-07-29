/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisado_projeto_po;

/**
 *
 * @author EngMauricio
 */
public class Gerente extends Funcionarios{
  
    public Gerente(){
        
    }
    public Gerente(String nome, String cpf, String numCTB, String RG, double salario){
        
        super(nome, cpf, numCTB, RG, salario);
    }
    
//     public Double SaiGe(){
//        
//            return getSalario();
//    }
}
