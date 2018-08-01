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
     Integer variavel;
     String out;
     Scanner in = new Scanner(System.in);
     Financeiro e = new Financeiro();
     Negocio    n = new Negocio();
         
        do{
            
         System.out.println("Digite: 1-Gado | 2-Cacau | 3-Terras | 4-Sair ");
         variavel = in.nextInt();
         
         switch(variavel){
             
             case 1:
                 n.addTipoNegocio("Gado");
                 System.out.println("Digite a quantidade de gado: ");
                 Double volume = in.nextDouble(); out = in.nextLine();
                 n.setQnt(volume);
                                  
                 System.out.println("Digite o preço: ");
                 Double vprec = in.nextDouble(); 
                 n.setPreco(vprec);
                 
                 n.addVbens(volume, vprec);
                 
                 break;
             case 2: 
                 n.addTipoNegocio("Cacau");
                 System.out.println("Digite a quantidade de Cacau em kg: ");
                 Double volumeCacau = in.nextDouble(); 
                 n.setQnt(volumeCacau);
                                  
                 System.out.println("Digite o preço por unidade kg: ");
                 Double vcacau = in.nextDouble(); out = in.nextLine();
                 n.setPreco(vcacau);
                 n.addVbens(volumeCacau, vcacau); 
                 break;
             case 3: 
                 n.addTipoNegocio("Terras");
                 System.out.println("Digite a quantidade de Terras em hectares: ");
                 Double volumeterras = in.nextDouble(); 
                 n.setQnt(volumeterras);
                 
                 System.out.println("Digite o preço por unidade: ");
                 Double vterras = in.nextDouble(); 
                 n.setPreco(vterras); 
                 n.addVbens(volumeterras, vterras);
                 break;
                 
             default:
                 break;
         }
         
         
        }while(variavel!= 4); 
        
                 System.out.println("Digite: 1-remover | 2-Nao remover ");
                 int k = in.nextInt();
                 if(k == 1){
                 System.out.println("Qual a quantidade ? ");
                 Double quan = in.nextDouble();
                 System.out.println("Qual o preço ? ");
                 Double pr = in.nextDouble();
                 n.GerarVbens(quan, pr);
                 }   
                     
                System.out.println("O tipo de negocio da sua empresa é ");
                System.out.println(n.getTipoNegocio());
                System.out.println("Digite: 1-Exibir Capital em Bens | 2- Não Exibir Capital em Bens ");
                variavel = in.nextInt();
                 
                if(variavel == 1 ){
                System.out.println("o valor em bens é R$ ");
                System.out.println(n.ExibeVbens());     
        }
                 
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
                 System.out.println(e.GerarCap());
         
    }
    
}
