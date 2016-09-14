/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gps.LocalizacaoGPS;

import static org.junit.Assert.*;

/**
 *
 * @author julio
 */
public class gpsTest {
    
    public void gpsTest() {
        LocalizacaoGPS gps1 = new LocalizacaoGPS(-15.2347, 20.789);
        LocalizacaoGPS gps2 = new LocalizacaoGPS(31.123, -10.89);
        
        Double novaLatitude1=-16.2357;
        Double novaLongitude1=21.789;
        
        gps1.setLatitude(novaLatitude1);
        gps2.setLongitude(novaLongitude1);
        
        assertEquals(novaLatitude1, gps1.getLatitude());
        assertEquals(novaLongitude1, gps1.getLongitude());
    }
    
   
}
