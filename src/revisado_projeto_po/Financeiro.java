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
public class Financeiro {
    
 
    public static Double soma;
    public static Double adicao;
    ArrayList<Double> EntCapital = new ArrayList<>();
    ArrayList<Double> SaiCapital = new ArrayList<>();
   
    
    public Financeiro(){
        
    }
        
    public Double GerarCap(){
        soma = 0.0;
        adicao = 0.0;
        for(Double i: EntCapital){
            soma = soma + i;
        }
        for(Double j: SaiCapital){
            adicao += j;
        }
       
        return soma - adicao;
        } 
        
    public ArrayList<Double> getEntCapital() {
        return EntCapital;
    }

    public void addEntCapital(Double Capital) {
        EntCapital.add(Capital);
    }
     public ArrayList<Double> getSaiCapital() {
        return SaiCapital;
    }

    public void addSaiCapital(Double Capital) {
       SaiCapital.add(Capital);
    }

}
