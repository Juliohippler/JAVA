/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

/**
 *
 * @author julio
 */
public class LocalizacaoGPS {
    
    private Double latitude;
    private Double longitude;

    public LocalizacaoGPS(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public void setLatitude(Double latitude){
        this.latitude=latitude; //recebe um novo parametro, do qual é um novo valor
        
    }
    public void setLongitude(Double longitude){
        this.longitude=longitude;
    }
    public Double getLatitude(){
        return this.latitude;
    }
    public Double getLongitude(){
        return this.longitude;
    }
    public static void main(String[] args){
        LocalizacaoGPS gps1 = new LocalizacaoGPS(-15.2347, 20.789);
        LocalizacaoGPS gps2 = new LocalizacaoGPS(31.123, -10.89);
        
        Double novaLatitude1=-16.2357;
        Double novaLongitude1=21.789;
        
        gps1.setLatitude(novaLatitude1);
        gps2.setLongitude(novaLongitude1);
        
        gps1.getLatitude();
        gps1.getLongitude();
    }
}
    

