package game.engine.titans;
import game.engine.interfaces.Attacker;

import java.lang.*;
public abstract class Titan implements Comparable<Titan> , Attacker {
    private final int baseHealth;
    public int getBaseHealth() {
        return baseHealth;
    }
    private int currentHealth ;
    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = Math.max(currentHealth, 0);
    }


    private final int baseDamage;
    public int getBaseDamage() {
        return baseDamage;
    }
    public int getDamage(){
        return baseDamage;
    }


    private final int heightInMeters;
    public int getHeightInMeters() {
        return heightInMeters;
    }


    private int distanceFromBase;
    public int getDistanceFromBase() {
        return distanceFromBase;
    }

    public void setDistanceFromBase(int distanceFromBase) {
        this.distanceFromBase = distanceFromBase;
    }

    private final int resourcesValue;

    public int getResourcesValue() {
        return resourcesValue;
    }
    private int speed;
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    private final int dangerLevel;

    public int getDangerLevel() {
        return dangerLevel;
    }

    public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int
            speed, int resourcesValue, int dangerLevel){
        this.currentHealth = baseHealth;
        this.baseHealth = baseHealth;
        this.baseDamage = baseDamage;
        this.heightInMeters = heightInMeters;
        this.distanceFromBase = distanceFromBase;
        this.speed = speed;
        this.resourcesValue = resourcesValue;
        this.dangerLevel = dangerLevel;
    }
    public int compareTo(Titan o ){
        return this.distanceFromBase-o.distanceFromBase;
    }
}
