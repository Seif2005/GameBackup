package game.engine.lanes;

import game.engine.base.Wall;
import game.engine.titans.Titan;
import game.engine.weapons.Weapon;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Lane implements Comparable<Lane>{
    //A class representing the Lanes in which a titan walk on to the wall.
    //the class is able to get compared based on it is danger level.
    private final Wall laneWall;
    private int dangerLevel;
    private final PriorityQueue<Titan> titans;
    private final ArrayList<Weapon> weapons;

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public Wall getLaneWall() {
        return laneWall;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public PriorityQueue<Titan> getTitans() {
        return titans;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
    public Lane(Wall laneWall){
        this.laneWall = laneWall;
        this.titans = new PriorityQueue<>();
        this.weapons = new ArrayList<>();
    }

    @Override
    public int compareTo(Lane o) {
        return this.dangerLevel-o.dangerLevel;
    }
}
