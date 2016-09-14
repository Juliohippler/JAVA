/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author julio
 */
 public class Circulo implements Figura {
    
    private double raio;
    private Posicao centro;

    public Circulo(double raio, Posicao centro) {
        this.raio = raio;
        this.centro = centro;
    }
    
    
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando circulo "
                + "de raio "+raio+" e centro "
                + "("+centro.getX()+","+centro.getY()+")");
    
    }

    @Override
    public void redimensionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pintar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

