/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriálisprojekt;



/**
 *
 * @author gyurk
 */
public class Osztás {
    public static int osztás(int osztó, int nevező){
        if(osztó == nevező) {return 1;};
        return osztó/nevező;
    }
}
