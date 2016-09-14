/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.contas.ContaCorrente;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ContaCorrenteTest {
    
   
    @Test
    public void testSacar(){
        
        ContaCorrente cc1 = new ContaCorrente("helio", "2828282");
        ContaCorrente cc2 = new ContaCorrente("fulano", "27272");
        
        assertEquals(cc1.getNumConta(), Integer.valueOf(1));
        assertEquals(cc2.getNumConta(), Integer.valueOf(2));
        
        Double valorDeposito = 500.0;
        assertTrue(cc1.depositar(valorDeposito));
        assertEquals(cc1.getSaldo(), valorDeposito);
        
        Double valorSaque = 300.0;
        assertTrue(cc1.sacar(valorSaque));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(valorDeposito - valorSaque));
        
        assertFalse(cc1.sacar(valorSaque));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(valorDeposito - valorSaque));
        
        // caso em que transfere
        Double saldoCc1Atual = cc1.getSaldo();
        Double valorTransferencia = 100.0;
        assertTrue(cc1.transferir(cc2,valorTransferencia));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(saldoCc1Atual - valorTransferencia));
        assertEquals(cc2.getSaldo(),
                valorTransferencia);
        
        // caso em que não transfere
        Double valorTransf2 = 200.0;
        assertFalse(cc2.transferir(cc1, valorTransf2));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(saldoCc1Atual - valorTransferencia));
        assertEquals(cc2.getSaldo(),
                valorTransferencia);
    }
    
}