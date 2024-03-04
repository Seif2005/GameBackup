package game.engine.titans;

public class TitanRegistry {
    //A class representing the TitanRegistry, which is a place to store the titan’s information
    //that was read from the csv file for later use.
    private final int code;
    public int getCode() {
        return code;
    }
    private int baseHealth;
    private int baseDamage;
    private int heightInMeters;
    private int speed;
    private int resourcesValue;
    private int dangerLevel;

    public int getBaseHealth() {
        return baseHealth;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getHeightInMeters() {
        return heightInMeters;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResourcesValue() {
        return resourcesValue;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public TitanRegistry(int code, int baseHealth, int baseDamage, int heightInMeters, int speed,
                         int resourcesValue, int dangerLevel){
        this.code = code;
        this.baseDamage = baseDamage;
        this.baseHealth = baseHealth;
        this.heightInMeters = heightInMeters;
        this.speed = speed;
        this.resourcesValue = resourcesValue;
        this.dangerLevel = dangerLevel;
    }
}
