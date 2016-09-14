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
public enum TipoCasa {
    SOBRADO("sobrado"), CASACOLONIAL("casaColonial"), PREDIO("predio");

    private String valor;
    
    private TipoCasa(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
}
