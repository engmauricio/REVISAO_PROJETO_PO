/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_po.X;

/**
 *
 * @author EngMauricio
 */
public class Funcionarios {

    private String nome;
    private String cpf;
    private String numCTB; 
    private String RG;
    private Double salario;
//    private Double despGe;
//    private Double despSu;
//    private Double despSe;
//    private Double despEm;
    
    public Funcionarios(){
        
    }
    public Funcionarios(String nome, String cpf, String numCTB, String RG, Double salario){
       
        this.nome = nome;
        this.cpf = cpf;
        this.RG = RG;
        this.numCTB = numCTB;
        this.salario = salario;
   
    }
    //despGe + despSu + despSe + despEm;
    public Double Despesas(){
        
        return null;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumCTB() {
        return numCTB;
    }

    public void setNumCTB(String numCTB) {
        this.numCTB = numCTB;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
