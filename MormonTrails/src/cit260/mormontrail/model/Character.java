/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author rherrerajr
 */
public class Character implements Serializable{
    
    private String name;
    private double money;
    private double huntingSkill;
    private double gatheringSkill;
    private double dailyStaminaDraw;
    private double currentHealth;
    private ArrayList<Game> games = new ArrayList<Game>();

    
    public Character() {
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getHuntingSkill() {
        return huntingSkill;
    }

    public void setHuntingSkill(double huntingSkill) {
        this.huntingSkill = huntingSkill;
    }

    public double getGatheringSkill() {
        return gatheringSkill;
    }

    public void setGatheringSkill(double gatheringSkill) {
        this.gatheringSkill = gatheringSkill;
    }

    public double getDailyStaminaDraw() {
        return dailyStaminaDraw;
    }

    public void setDailyStaminaDraw(double dailyStaminaDraw) {
        this.dailyStaminaDraw = dailyStaminaDraw;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.huntingSkill) ^ (Double.doubleToLongBits(this.huntingSkill) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.gatheringSkill) ^ (Double.doubleToLongBits(this.gatheringSkill) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.dailyStaminaDraw) ^ (Double.doubleToLongBits(this.dailyStaminaDraw) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.currentHealth) ^ (Double.doubleToLongBits(this.currentHealth) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", money=" + money + ", huntingSkill=" + huntingSkill + ", gatheringSkill=" + gatheringSkill + ", dailyStaminaDraw=" + dailyStaminaDraw + ", currentHealth=" + currentHealth + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (Double.doubleToLongBits(this.huntingSkill) != Double.doubleToLongBits(other.huntingSkill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gatheringSkill) != Double.doubleToLongBits(other.gatheringSkill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dailyStaminaDraw) != Double.doubleToLongBits(other.dailyStaminaDraw)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentHealth) != Double.doubleToLongBits(other.currentHealth)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
