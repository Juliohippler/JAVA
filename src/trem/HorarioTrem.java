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
public class HorarioTrem {
    private int hora;
    private String estacao;
    
    public HorarioTrem(int hora, String estacao){
        this.estacao=estacao;
        this.hora=hora;
    }

    @Override
    public String toString() {
        return hora + "horas, na estacao " + estacao; 
    }

   
    
}
