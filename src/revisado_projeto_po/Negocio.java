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
public class Negocio {
  
    private Double Qnt; 
    private Double Preco;  
    private Integer TipoNegocio;
    
    public Negocio(){
        
    }
       
    public Negocio(Double Qnt, Double Preco){
        
        this.Preco = Preco;
        this.Qnt = Qnt;        
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
