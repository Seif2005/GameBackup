package game.engine.base;

import game.engine.interfaces.Attackee;

public class Wall implements Attackee {
	//A class representing the Walls in which a titan attacks in the game. A wall is a class that gets attacked. Its resources value is -1 and is not deducted from the player’s resources if destroyed.
	
	private final int baseHealth; 	//An integer representing the original value of the wall’s health. This attribute is READ ONLY and gets initialized once.
	private int currentHealth;	//An integer representing the current titan’s health which originally equals the baseHealth. This attribute is READ and WRITE through a relevant interface’s method.

	public Wall(int baseHealth)
	{
		this.baseHealth=baseHealth;
		this.currentHealth=baseHealth;
	}
	public int getBaseHealth() {
		return baseHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
        this.currentHealth = Math.max(currentHealth, 0);
	}

	@Override
	public int getResourcesValue() {
		return -1;
	}
}
