/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisado_projeto_po;

import java.util.ArrayList;

/**
 *
 * @author EngMauricio
 */
public class Negocio {
  
    ArrayList<Double> Vbens = new ArrayList<>(); 
    private Double Qnt;
    private Double Preco;  
    private Integer TipoNegocio;
    public static Double soma;
    
    public Negocio(){
        
    }
       
//    public Negocio(Double Qnt, Double Preco){
//        
//        this.Preco = Preco;
//        this.Qnt = Qnt;        
//    }
    
     public void addVbens (Double Preco, Double Qnt) {
         Double op;
         op = Preco*Qnt;
        Vbens.add(op);
    }
     
    public ArrayList<Double> getVbens() {
        return Vbens;
    } 
    
    public Double somaVbens(){
    soma = 0.0;    
    for(Double j:Vbens){
            soma = soma + j;
        }
        
        return soma;
    }
        
    public Double getQnt() {
        return Qnt;
    }
    
    public void setQnt(Double Qnt) {
        this.Qnt = Qnt;
    }
   
    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    } 
        
}
