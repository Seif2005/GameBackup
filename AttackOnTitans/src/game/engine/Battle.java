package game.engine;

import game.engine.base.Wall;
import game.engine.dataloader.DataLoader;
import game.engine.lanes.Lane;
import game.engine.titans.Titan;
import game.engine.titans.TitanRegistry;
import game.engine.weapons.factory.WeaponFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Battle {
    //A class representing the Game itself. This class will represent the main engine
    //that manages the flow of the game.

    //A 2D array containing titans’ codes, representing the order
    //of titans during each phase. This attribute is a constant at class level that’s initialized only
    //once.

    //region vars
    private static final int[][] PHASES_APPROACHING_TITANS = {{1,1,1,2,1,3,4},{2,2,2,1,3,3,4},{4,4,4,4,4,4,4}};
    private static final int WALL_BASE_HEALTH = 10000;

    public void setNumberOfTurns(int numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }

    public void setResourcesGathered(int resourcesGathered) {
        this.resourcesGathered = resourcesGathered;
    }

    public void setBattlePhase(BattlePhase battlePhase) {
        this.battlePhase = battlePhase;
    }

    public void setNumberOfTitansPerTurn(int numberOfTitansPerTurn) {
        this.numberOfTitansPerTurn = numberOfTitansPerTurn;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTitanSpawnDistance(int titanSpawnDistance) {
        this.titanSpawnDistance = titanSpawnDistance;
    }

    private int numberOfTurns;
    private int resourcesGathered;
    private BattlePhase battlePhase;
    private int numberOfTitansPerTurn;
    private int score;
    private int titanSpawnDistance;
    private final WeaponFactory weaponFactory = new WeaponFactory();
    private final HashMap<Integer, TitanRegistry> titansArchives = DataLoader.readTitanRegistry();
    private final ArrayList<Titan> approachingTitans = new ArrayList<>();//treated as a queue FIFO
    private final PriorityQueue<Lane> lanes = new PriorityQueue<>();//Least dangerous lanes will have the highest priority
    private final ArrayList<Lane> originalLanes = new ArrayList<>();

    public int getNumberOfTurns() {
        return numberOfTurns;
    }

    public int getResourcesGathered() {
        return resourcesGathered;
    }

    public BattlePhase getBattlePhase() {
        return battlePhase;
    }

    public int getNumberOfTitansPerTurn() {
        return numberOfTitansPerTurn;
    }

    public int getScore() {
        return score;
    }

    public int getTitanSpawnDistance() {
        return titanSpawnDistance;
    }

    public WeaponFactory getWeaponFactory() {
        return weaponFactory;
    }

    public HashMap<Integer, TitanRegistry> getTitansArchives() {
        return titansArchives;
    }

    public ArrayList<Titan> getApproachingTitans() {
        return approachingTitans;
    }

    public PriorityQueue<Lane> getLanes() {
        return lanes;
    }

    public ArrayList<Lane> getOriginalLanes() {
        return originalLanes;
    }
    //endregion
    //constructor
    public Battle(int numberOfTurns, int score, int titanSpawnDistance, int initialNumOfLanes,
                  int initialResourcesPerLane) throws IOException {
        this.resourcesGathered = initialResourcesPerLane*initialNumOfLanes;
        this.battlePhase = BattlePhase.EARLY;
        this.numberOfTitansPerTurn = 1;
        this.numberOfTurns = numberOfTurns;
        this.score = score;
        this.titanSpawnDistance = titanSpawnDistance;
    }
    private void initializeLanes(int numOfLanes){
        Wall wall = new Wall(WALL_BASE_HEALTH);
        for (int i = 0;i<numOfLanes;i++){
            Lane lane = new Lane(wall);
            originalLanes.add(lane);
            lanes.add(lane);
        }
    }
}
