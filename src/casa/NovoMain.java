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
        Endereco ec1 = new Endereco("Rua 7 de setembro", 3560,"marechal");
        Casa c1 = new Casa(tc1, 300.00, ec1, 5);       
        
        System.out.println(c1.toString());
        
        
        TipoCasa tc2 = TipoCasa.SOBRADO;       
        Endereco ec2 = new Endereco("Avenida RIo grande do sul ", 3560,"palotina");
        Casa c2 = new Casa(tc2, 230.00, ec2, 3);
  
        System.out.println(c2.toString());
        
        TipoCasa tc3 = TipoCasa.PREDIO;       
        Endereco ec3 = new Endereco("Abenida das Torres", 3560,"guaira");
        Casa c3 = new Casa(tc3, 1000000.00, ec3, 8);
  
        System.out.println(c3.toString());
    }
}
