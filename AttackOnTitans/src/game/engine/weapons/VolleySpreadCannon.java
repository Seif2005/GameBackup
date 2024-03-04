package game.engine.weapons;

//A class representing the VolleySpreadCannons available in the game. This class is a
//subclass of the Weapon class.
public class VolleySpreadCannon extends Weapon{
    private final int minRange;
    private final int maxRange;
    public static final int WEAPON_CODE = 3;

    public VolleySpreadCannon(int baseDamage, int minRange, int maxRange) {
        super(baseDamage);
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }
}
