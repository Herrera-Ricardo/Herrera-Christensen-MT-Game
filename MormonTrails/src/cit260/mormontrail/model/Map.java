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
public class Map implements Serializable{
    
    private String currentLocation;

    public Map(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Map() {
       
    }
    
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.currentLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }
    
    
}
