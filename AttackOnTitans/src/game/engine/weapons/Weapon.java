package game.engine.weapons;
// A class representing the Weapons available in the game. A weapon should be able to
//perform an attack.
//No objects of type Weapon can be instantiated.
public abstract class Weapon {
    private final int baseDamage;

    public Weapon(int baseDamage){
        this.baseDamage = baseDamage;
    }
    public int getDamage() {
        return baseDamage;
    }
}
