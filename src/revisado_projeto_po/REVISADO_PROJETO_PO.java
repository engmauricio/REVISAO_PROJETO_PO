/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisado_projeto_po;

import java.util.Scanner;

/**
 *
 * @author EngMauricio
 */
public class REVISADO_PROJETO_PO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double valor;
         Scanner in = new Scanner(System.in);
         Financeiro e = new Financeiro();
         do{
             
         
         System.out.println("digite o valor de entrada ou digite 1 para finalizar: ");
         valor =  in.nextDouble();
         if(valor == 1){
         continue;
                        }
         e.addEntCapital(valor);
         System.out.println("digite o valor de saida ou digite 1 para finalizar: ");
         valor = in.nextDouble();
         if(valor == 1){
             continue;
         }
         e.addSaiCapital(valor);
         }while(valor!=1);
         System.out.println("Valor em caixa de capital: ");
         System.out.println(e.GerarEntradaCap());
         
    }
    
}
