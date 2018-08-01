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
    ArrayList<String> TipoNegocio = new ArrayList<>();
    public static Double soma;
    public static Double adicao;
    
    public Negocio(){
        
    }
        
     public void addVbens (Double Preco, Double Qnt) {
         Double op;
         op = Preco*Qnt;
        Vbens.add(op);
    }
     
    public ArrayList<Double> getVbens() {
        return Vbens;
    } 
    
    public Void GerarVbens(Double x, Double y){
    soma = 0.0;    
    adicao = 0.0;
    for(Double j: Vbens){
            soma = soma + j;
        }
        adicao = soma - x*y;
        
        return null;
    }

    public Double ExibeVbens(){
        
        return adicao;
    }
    public void addTipoNegocio(String Tipo){
        TipoNegocio.add(Tipo);
    }
    
    public ArrayList<String> getTipoNegocio(){
        return TipoNegocio;
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
