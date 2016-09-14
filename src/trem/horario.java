/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author julio
 */
class horario {
    Date d1 = new Date();
    DateFormat df3;
            String f3 = "hh:mm";
 

    horario() {
        this.df3 = new SimpleDateFormat(f3);
    }

}
