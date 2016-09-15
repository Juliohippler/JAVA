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
        HorarioTrem ht1=new HorarioTrem(13, "marginal");
        Rota rt1= new Rota("marechal", "palotina");
        Trem t1 = new Trem("Trem da vila", ht1, rt1, tt1);
        
        System.out.println(t1.toString());
        
        TipoTrem tt2 = TipoTrem.LOCAL;
        HorarioTrem ht2=new HorarioTrem(13, "Ipiranga");
        Rota rt2= new Rota("Botafogo", "Higienopolis");
        Trem t2 = new Trem("Trem das favela", ht2, rt2, tt2);
        
        System.out.println(t2.toString());
    }
    
}
