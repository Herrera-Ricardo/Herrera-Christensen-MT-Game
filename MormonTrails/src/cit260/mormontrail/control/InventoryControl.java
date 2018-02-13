/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.control;
import java.lang.Math;
/**
 *
 * @author rherrerajr
 */
public class InventoryControl {
 
    public static double calcMaxWeight(double wagon, double oxen) {
        
        if (oxen <= 0 || oxen > 9){
            return -1;
        }
        
        if (wagon < 1 || wagon > 3){
            return -1;
        }
        
        double wagonWeight = Math.sqrt(wagon);
        double capacity = Math.round(wagonWeight * oxen) * 500;
        return capacity;
    }

}
