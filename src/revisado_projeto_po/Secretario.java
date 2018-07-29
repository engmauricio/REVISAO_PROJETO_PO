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
public class Secretario extends Funcionarios {
    
public Secretario(){
        
    }
    public Secretario(String nome, String cpf, String numCTB, String RG, double salario){
        
        super(nome, cpf, numCTB, RG, salario);
    }
    
//     public Double SaiSec(){
//        
//            return getSalario();
//    }

}
