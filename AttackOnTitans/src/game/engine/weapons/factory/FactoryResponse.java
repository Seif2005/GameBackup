package game.engine.weapons.factory;

import game.engine.weapons.Weapon;

//A class representing the FactoryResponse, which is an object to store the weapon that
//was bought with the remaining resources
public class FactoryResponse {
    private final Weapon weapon;
    private final int remainingResources;

    public Weapon getWeapon() {
        return weapon;
    }

    public int getRemainingResources() {
        return remainingResources;
    }

    public FactoryResponse(Weapon weapon, int remainingResources) {
        this.weapon = weapon;
        this.remainingResources = remainingResources;
    }
}
