/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author rherrerajr
 */
public class InventoryItem implements Serializable{

    private String oxen;
    private double wagon;
    private double food;
    private double wagonWheel;
    private double ammunition;

    public InventoryItem() {
    }
    

    public String getOxen() {
        return oxen;
    }

    public void setOxen(String oxen) {
        this.oxen = oxen;
    }

    public double getWagon() {
        return wagon;
    }

    public void setWagon(double wagon) {
        this.wagon = wagon;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getWagonWheel() {
        return wagonWheel;
    }

    public void setWagonWheel(double wagonWheel) {
        this.wagonWheel = wagonWheel;
    }

    public double getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(double ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.oxen);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.wagon) ^ (Double.doubleToLongBits(this.wagon) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.food) ^ (Double.doubleToLongBits(this.food) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.wagonWheel) ^ (Double.doubleToLongBits(this.wagonWheel) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.ammunition) ^ (Double.doubleToLongBits(this.ammunition) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "oxen=" + oxen + ", wagon=" + wagon + ", food=" + food + ", wagonWheel=" + wagonWheel + ", ammunition=" + ammunition + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (Double.doubleToLongBits(this.wagon) != Double.doubleToLongBits(other.wagon)) {
            return false;
        }
        if (Double.doubleToLongBits(this.food) != Double.doubleToLongBits(other.food)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wagonWheel) != Double.doubleToLongBits(other.wagonWheel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ammunition) != Double.doubleToLongBits(other.ammunition)) {
            return false;
        }
        if (!Objects.equals(this.oxen, other.oxen)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
