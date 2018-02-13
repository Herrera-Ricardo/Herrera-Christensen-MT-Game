/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrails;
import cit260.mormontrail.model.Character;
import cit260.mormontrail.model.Game;
import cit260.mormontrail.model.InventoryItem;
import cit260.mormontrail.model.Map;
import java.util.Set;

/**
 *
 * @author Ricardo-Mini
 */
public class MormonTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character characterOne = new Character();
        
        characterOne.setName("User 1");
        characterOne.setMoney(500.00);
        characterOne.setHuntingSkill(10.00);
        characterOne.setGatheringSkill(10.00);
        characterOne.setDailyStaminaDraw(5.00);
        characterOne.setCurrentHealth(100.00);
        
        String characterOneName = characterOne.getName();
        double characterOneMoney = characterOne.getMoney();
        double characterOneHuntingSkill = characterOne.getHuntingSkill();
        double characterOneGatheringSkill = characterOne.getGatheringSkill();
        double characterOneDailyStaminaDraw = characterOne.getDailyStaminaDraw();
        double characterOneCurrentHealth = characterOne.getCurrentHealth();
        
        System.out.println(characterOne.toString());
         
        
        Game gameOne = new Game();
        
        gameOne.setPace(2);
        gameOne.setMilesTraveled(50);
        gameOne.setDayOnTrail(5);
        gameOne.setCurrentMoneyBalance(500);
        
        System.out.println(gameOne.toString());
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setOxen(2);
        inventoryItemOne.setWagonWheel(2);
        inventoryItemOne.setWagon(1);
        inventoryItemOne.setFood(1000);
        inventoryItemOne.setAmmunition(50);
        
        System.out.println(inventoryItemOne.toString());
        
        Map mapOne = new Map();
        
        mapOne.setCurrentLocation("Nauvoo");
        
        System.out.println(mapOne.toString());
                
        
    }
    
}
