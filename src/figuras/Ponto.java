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
 public class Ponto implements Figura {
    
    private Posicao posicao;
    
    /**
     *
     * @param posicao
     */
    public Ponto(Posicao posicao) {
        this.posicao=posicao;
    }

    /**
     *
     */
    @Override
    public void desenhar() {
        System.out.println("Desenhando ponto "
                + "na posicao x "+posicao.getX()+" e posicao y "
                + posicao.getY()+ "" );
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
