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
public class NovoMain {
    public static void main(String[] args){
        TipoTrem tt1 = TipoTrem.DISTANCIA;
        HorarioTrem ht1=new HorarioTrem(13:30, "marginal");
        Rota rt1= new Rota("marechal", "palotina");
        Trem t1 = new Trem("Trem da vila", ht1, rt1, tt1);
    }
}