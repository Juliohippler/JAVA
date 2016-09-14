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
public enum TipoTrem {
    LOCAL("local"), DISTANCIA("distancia");

    private String valor;
    
    private TipoTrem(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
