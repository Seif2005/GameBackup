package game.engine.dataloader;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
//this code was assisted by the explanation of Google's Gemini AI
public class DataLoader {
    //A class that is used to import data from a given csv file. The imported data is then used
    //to create and initialize registries for Titans and Weapons and fill them with the entries from the
    //csv files. The read file should be placed in the same directory as the .src folder and not inside it.

    private static final String TITANS_FILE_NAME = "titans.csv";
    private static final String WEAPONS_FILE_NAME = "weapons.csv";
    //region Titan
    public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException{
        HashMap<Integer,TitanRegistry> map = new HashMap<>();
        // extract from buffer reader
        try (BufferedReader reader = new BufferedReader(new FileReader(TITANS_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line based on comma (",") delimiter
                String[] values = line.split(",");
                int code = Integer.parseInt(values[0]);
                TitanRegistry titanRegistry = getTitanRegistry(values, code);
                map.put(code,titanRegistry);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return map;
    }

    private static TitanRegistry getTitanRegistry(String[] values, int code) {
        int baseHealth = Integer.parseInt(values[1]);
        int baseDamage = Integer.parseInt(values[2]);
        int heightInMeters = Integer.parseInt(values[3]);
        int speed = Integer.parseInt(values[4]);
        int resourcesValue = Integer.parseInt(values[5]);
        int dangerLevel = Integer.parseInt(values[6]);
        return new TitanRegistry(code,baseHealth,baseDamage,heightInMeters,
                speed,resourcesValue,dangerLevel);
    }
    //endregion
    //region weapons
    public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException{
        HashMap<Integer,WeaponRegistry> map = new HashMap<>();
        //get from csv file
        try (BufferedReader reader = new BufferedReader(new FileReader(WEAPONS_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line based on comma (",") delimiter
                String[] values = line.split(",");
                int code = Integer.parseInt(values[0]);
                WeaponRegistry weaponRegistry = getWeaponRegistry(values, code);
                map.put(code,weaponRegistry);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return map;
    }

    private static WeaponRegistry getWeaponRegistry(String[] values, int code) {
        int price = Integer.parseInt(values[1]);
        int damage = Integer.parseInt(values[2]);
        String name = values[3];
        if (code==3){
            int minRange = Integer.parseInt(values[4]);
            int maxRange = Integer.parseInt(values[5]);
            return new WeaponRegistry(code,price,damage,name,minRange,maxRange);
        }else{
            return new WeaponRegistry(code,price,damage,name);
        }
    }
    //endregion
}
