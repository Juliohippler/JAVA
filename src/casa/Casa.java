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
   
    private TipoCasa tipocasa;
    private Preco preco;
    private Endereco endereco;
    private Quartos quartos;
   
    
    public Casa(TipoCasa tipocasa, Preco preco, Endereco endereco, Quartos quartos){
        this.tipocasa=tipocasa;
        this.preco=preco;
        this.endereco=endereco;
        
        this.quartos=quartos;
    }
}
