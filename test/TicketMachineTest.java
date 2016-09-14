/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import maquinaticket.TicketMachine;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author julio
 */
public class TicketMachineTest {
    
    private TicketMachine tm1;
    private TicketMachine tm2;
    Double preco1=5.0;
    Double preco2=6.0;
    Double insere1=5.0;
    Double insere2=2.0;
    Double insere3=7.0;
    
    
    public TicketMachineTest() {  
   
        tm1 = new TicketMachine(preco1);
        tm2 = new TicketMachine(preco2);
    }
    
    @Test
    public void testInsertMoney(){
        tm1.insertMoney(insere1);       
        assertEquals(tm1.getBalanco(), insere1);
        tm2.insertMoney(insere2);
        assertEquals(tm2.getBalanco(), insere2);      
       
    }   
    
    @Test
    public void testsetPreco(){
       assertEquals(tm1.getPreco(), preco1);       
       assertEquals(tm2.getPreco(), preco2);
    }
    
    @Test
    public void testGiveChange(){
        tm1.insertMoney(insere3);
        Double troco = tm1.getBalanco() - tm1.getPreco();
        assertEquals(tm1.giveChange(), troco);
        
    }
    
    @Test
    public void testRefundBalance(){
        tm1.insertMoney(insere2);
        tm1.refundBalance();
        assertEquals(tm1.getBalanco(), Double.valueOf(0));
    }
    
    

}
