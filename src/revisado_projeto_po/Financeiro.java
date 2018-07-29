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
    
    //private Double EntCapital;
    //private Double SaiCapital;
    public static Double soma;
    public static Double adicao;
    //private Double Relatorio;
    ArrayList<Double> EntCapital = new ArrayList<>();
    ArrayList<Double> SaiCapital = new ArrayList<>();
    // public Double GerarSaldoCapital;
    
    public Financeiro(){
        
    }
        
    public Double GerarEntradaCap(){
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
//    public Double GerarSaiCap(){
//         soma = 0.0;
//        for(Double i: EntCapital)
//            soma = soma + i;
//		
//        return soma;
//    }
//    public Financeiro(Double EntCapital, Double SaiCapital, Double Relatorio){
//        
//        this.EntCapital = EntCapital;
//        this.SaiCapital = SaiCapital;
//        this.Relatorio = Relatorio;
//        
//    }
    
        
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
//
//    public Double getSaiCapital() {
//        return SaiCapital;
//    }
//
//    public void setSaiCapital(Double SaiCapital) {
//        this.SaiCapital = SaiCapital;
//    }
//
//    public Double getRelatorio() {
//        return Relatorio;
//    
//    }
//
//    public void setRelatorio(Double Relatorio) {
//        this.Relatorio = Relatorio;
//   
//    }
       
//   public Double GerarSaldoCapital(){
//       
//       return  getEntCapital() - getSaiCapital();
//          
//    }
}
