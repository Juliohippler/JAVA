/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author julio
 */
public class Casa {
    
    private int quartos;
    private Double preco;
    private TipoCasa tipocasa;    
    private Endereco endereco; 
   
    
    public Casa(TipoCasa tipocasa, Double preco, Endereco endereco, int quartos){
        this.tipocasa=tipocasa;
        this.preco=preco;
        this.endereco=endereco;        
        this.quartos=quartos;
    }

     @Override
    public String toString() {
        return tipocasa + ", " + quartos + " quartos, " + preco + ", " + endereco;
    }
    
    
}
