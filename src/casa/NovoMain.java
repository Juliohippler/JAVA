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
public class NovoMain {
    
    public static void main(String[] args) {
        TipoCasa tc1 = TipoCasa.CASACOLONIAL;
        Preco pc1 = new Preco(300.0);
        Endereco ec1 = new Endereco("Rua 7 de setembro", 3560,"marechal");
  
        Quartos qc1 = new Quartos(3);
        
        System.out.println(tc1.getValor()+"," +qc1.getQuartos()+" quartos,"+pc1.getPreco()+" reais,"+ec1.getRua()+","+ec1.getNumero()+","+ec1.getCidade() );
        
        
        TipoCasa tc2 = TipoCasa.SOBRADO;
        Preco pc2 = new Preco(300.0);
        Endereco ec2 = new Endereco("Rua 7 de setembro", 3560,"palotina");
  
        Quartos qc2 = new Quartos(2);
        
        System.out.println(tc2.getValor()+"," +qc2.getQuartos()+" quartos,"+pc2.getPreco()+" reais,"+ec2.getRua()+","+ec2.getNumero()+","+ec2.getCidade() );
    }
}
