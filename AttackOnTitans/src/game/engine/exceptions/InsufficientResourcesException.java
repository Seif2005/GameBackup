package game.engine.exceptions;

public class InsufficientResourcesException extends GameActionException {
	//representing an exception that can occur whenever the player tries to buy a weapon without having enough resources.
	private static final String MSG="Not enough resources, resources provided = ";
	private int resourcesProvided;
	
	public InsufficientResourcesException(int resourcesProvided)
	{
		super(MSG+resourcesProvided);
	
		this.resourcesProvided=resourcesProvided;
	}
	public InsufficientResourcesException(String message, int resourcesProvided)
	{
		super(message);
		this.resourcesProvided=resourcesProvided;
	}
	
	
	
	public int getResourcesProvided() {
		return resourcesProvided;
	}
	public void setResourcesProvided(int resourcesProvided) {
		this.resourcesProvided = resourcesProvided;
	}
	
	
	
}
