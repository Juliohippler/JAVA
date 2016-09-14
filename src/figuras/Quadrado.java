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
public class Quadrado implements Figura {

    
    private double lado;
    private Posicao posicao;
    private String tipoFigura;

    public Quadrado(double lado, Posicao posicao) {
        this.lado = lado;
        this.posicao = posicao;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando quadrado "
                + "de lado "+lado+" e posicao "
                + "("+posicao.getX()+","+posicao.getY()+")");
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
    
    
    public void darPirueta() {
        System.out.println("dando pirueta");
    }
    
}