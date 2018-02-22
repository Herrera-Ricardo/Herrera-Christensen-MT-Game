/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.control;
import cit260.mormontrail.model.Character;

/**
 *
 * @author rherrerajr
 */
public class CharacterControl {
 
    public static double calcPartySize(double currentParty, double newPersons) {
        
        if (newPersons <= 0 || newPersons > 5){
            return -1;
        }
        
        if (currentParty <= 0 || currentParty > 5) {
            return -1;
        }
        
        if (currentParty + newPersons > 5){
            return -1;
        }
        
        double capacity = (newPersons + currentParty);
        return capacity;
    }

}
