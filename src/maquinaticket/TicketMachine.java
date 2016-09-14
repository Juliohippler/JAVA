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
    
    public TicketMachine(Double preco) {
        this.preco = preco;
        this.balanco = 0.0;
        this.total = 0.0;
           }

    public void insertMoney(Double quantia) {
        if (quantia > 0) {
            this.balanco += quantia;
            System.out.println("Foi inserido " + quantia + " reais.");
        }
        else {
            System.out.println("Insira um valor maior que zero.\n");
        }
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void prompt() {
        System.out.println("Insira a quantidade correta de dinheiro");
    }

    public void showPrice() {
        System.out.println("O preço do bilhete é " + this.preco + " reais.");
    }

    public void empty() {
        this.total = 0.0;
        System.out.println("A máquina foi esvaziada \n "
                + "Sem dinheiro na máquina");
    }

    public Double giveChange(){
        if (this.balanco > this.preco){
            return (this.balanco - this.preco);
        }
        return 0.0;
    }
        public void printTicket() {
        if (this.balanco >= this.preco) {
            System.out.println(" ------ Ingresso Impresso ------- \n"
                    + " ------ Evento no dia 30/12/2016 -------");
            
            if (this.giveChange() > 0) {
                System.out.println("Retire seu troco no valor de " + this.giveChange() + " reais.");
            }
            this.total += this.balanco;
            this.balanco = 0.0;
        } else {
            Double falta = this.preco - this.balanco;
            prompt();
            System.out.println("Ainda falta " + falta + " reais.");
        }
    }

    public Double getBalanco() {
        return balanco;
    }

    public Double getPreco() {
        return preco;
    }
    
    public void refundBalance(){
        if (this.balanco > 0.0) {
            System.out.println("Cliente reembolsado.");
            this.balanco = 0.0;
        }
    }
    public void printTotal(){
        System.out.println("O valor total na máquina é: "+this.total);
    }
     public static void main(String[] args) {
        TicketMachine tm1 = new TicketMachine(10.0);
        tm1.showPrice();                        
        tm1.insertMoney(10.0);
	tm1.printTicket();
        tm1.printTotal();
        
        System.out.println("");
        TicketMachine tm2 = new TicketMachine(30.0);
        tm2.showPrice();
        tm2.insertMoney(25.0);
        tm2.printTicket();
        tm2.empty();

    }
}


/* RESPOSTA A PERGUNTA 4
4-Crie duas máquinas de vender bilhetes com preços diferentes.As chamads para seus métodos 
showPrice mostram a mesma saída? Por que ? 

Não. Por que cada nova máquina criada, é um novo objeto máquina, do qual é possivel
fazer as alterações nesse objeto.
*/