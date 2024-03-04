package game.engine.exceptions;

public class InvalidLaneException extends GameActionException{
	//representing an exception that can occur whenever the player tries to buy a weapon in a destroyed or non existent lane.
	private static final String MSG= "Action done on an invalid lane";
	
	public InvalidLaneException()
	{
		super(MSG);
	}
	public InvalidLaneException(String message)
	{
		super(message);
	}
	
}
