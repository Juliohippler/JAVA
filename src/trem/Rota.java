/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trem;

/**
 *
 * @author julio
 */
public class Rota {
    private String origem;
    private String destino;
    
    public Rota(String origem, String destino){
        this.origem=origem;
        this.destino=destino;
    }
        
    @Override
    public String toString() {
        return " saindo de " + origem + " com destino a " + destino; //To change body of generated methods, choose Tools | Templates.
    }
    
}
