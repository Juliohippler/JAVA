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
    private horario hora;
    private String estacao;
    
    public HorarioTrem(horario hora, String estacao){
        this.estacao=estacao;
        this.hora=hora;
    }

    HorarioTrem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}