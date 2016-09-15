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
public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    
    public Endereco(String rua, int numero, String cidade){
        this.rua=rua;
        this.numero=numero;
        this.cidade=cidade;
    }
    
    @Override
       public String toString() {
        return  rua + " " + numero +  ", " + cidade;
    }    
    
    
    
}
