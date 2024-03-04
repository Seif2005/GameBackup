package game.engine.weapons;
import java.lang.*;
public class WeaponRegistry {
    //class representing the WeaponRegistry, which is a place to store the weapon’s information
    //that was read from the csv file for later use.
    private int code;
    private int price;
    private int damage;
    private String name;
    private int minRange;
    private int maxRange;

    public int getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }
    public WeaponRegistry(int code, int price){
        this.code = code;
        this.price = price;
    }
    public WeaponRegistry(int code, int price, int damage, String name){
        this.code = code;
        this.price = price;
        this.damage = damage;
        this.name = name;
    }
    public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange){
        this.code = code;
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.maxRange = maxRange;
        this.minRange = minRange;
    }
}
