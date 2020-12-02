/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import faktoriálisprojekt.Osztás_kivetel;
import org.junit.Test;
import static org.junit.Assert.*;



public class Osztás_tesztelés {
    
    public Osztás_tesztelés() {
    }
    
    @Test
    public void osztás16() throws Osztás_kivetel {
        int oszto = 64;
        int nevezo = 16;
        int elvárás = 4;
        int eredmény = faktoriálisprojekt.Osztás.osztás(oszto, nevezo);
        assertEquals(eredmény, elvárás);
    }
    
    @Test
    public void osztás5() throws Osztás_kivetel {
        int oszto = 60;
        int nevezo = 5;
        int elvárás = 12;
        int eredmény = faktoriálisprojekt.Osztás.osztás(oszto, nevezo);
        assertEquals(eredmény, elvárás);
    }
}
