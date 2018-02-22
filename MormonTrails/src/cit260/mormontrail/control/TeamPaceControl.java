/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.control;
import cit260.mormontrail.model.Game;
/**
 *
 * @author rherrerajr
 */
public class TeamPaceControl {
 
    public enum MovingPace {
        //The pace of the team traveling across the map.
            STEADY(1), // travels at 1.6 mph
            STRENUOUS(2), // travels at 2 mph
            GRUELING(3); // travels at 2.4 mph
            
            private double pace; 
            
            MovingPace(double pace) { 
                this.pace = pace;
            }
            
            double getPace() {
                return pace;
            }            
        
    }
}
