package game.engine.weapons.factory;

import game.engine.dataloader.DataLoader;
import game.engine.weapons.WeaponRegistry;

import java.io.IOException;
import java.util.HashMap;

//A class representing the WeaponFactory, which is used to store the available weapons
//that can be purchased during each turn
public class WeaponFactory {
    private final HashMap<Integer, WeaponRegistry> weaponShop;
    public WeaponFactory() throws IOException{
        weaponShop = DataLoader.readWeaponRegistry();
    }

    public HashMap<Integer, WeaponRegistry> getWeaponShop() {
        return weaponShop;
    }
}
