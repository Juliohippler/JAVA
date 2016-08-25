/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaticket;

/**
 *
 * @author julio
 */
public class TicketMachine {
    
    private Double preco;
    private Double balanco;
    private Double total;
    
    
    public TicketMachine(Double preco){
        this.preco=0.0;
        this.balanco=0.0;
        this.total=0.0;
    }
    
    public void inserirDinheiro(Double quantia){
        if (quantia > 0){
            this.balanco += quantia;
        }
        else{
            System.out.println("Insira o valor correto");
        }
    }    
    /**
     *
     */
    public void imprimirBilhete(){
        if(this.balanco >= this.preco){
            System.out.println("---- BILHETE ATÉ LINHA DURA -------- \n"
                    + "--------- VÁLIDO ATÉ 25/08-------- ");
            if(this.giveChange()>0){
                System.out.println("Retire seu troco: " + this.giveChange()+ " reais");
            }
            this.total+=this.balanco;
            this.balanco=0.0;              
        }else{
            Double falta = this.preco - this.balanco;
            prompt();
            System.err.println("Ainda falta: " + falta + " reais");
        }
    }
    public void prompt(){
        System.err.println("Insira a quantidade correta de dinheiro");
    }
    public void setPreco(Double preco){
        this.preco=preco;
    }
    public void showPrice(){
        System.out.println("O preço do bilhete é: " +this.preco+ " Reais");
    }
    public Double giveChange(){
        if(this.balanco > this.preco){
            return (this.balanco-this.preco);
        }
        return 0.0;
    }
    public void empty(){
        this.total=0.0;
        System.out.println("Sem dinheiro na maquina");
    }
            
    public Double getBalanco() {
        return balanco;
    }
    
    public void printTotal(){
        System.out.println("Total da máquina: R$ "+ this.total);
    }
    
    public static void main(String [] args){
        TicketMachine tm1 = new TicketMachine(5.0);
        tm1.showPrice();
        tm1.inserirDinheiro(3.0);
        tm1.imprimirBilhete();
        tm1.empty();
        tm1.printTotal();
        tm1.getBalanco();
        System.out.println(tm1.getBalanco());
    }
    
}
