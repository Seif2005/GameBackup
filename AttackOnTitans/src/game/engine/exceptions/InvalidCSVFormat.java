package game.engine.exceptions;

import java.io.IOException;

public class InvalidCSVFormat extends IOException {
	//representing an exception that can occur whenever an invalid csv is being read
	
	private static final String MSG = "Invalid input detected while reading csv file, input = \n";
	private String inputLine;
	//A variable representing the csv file name
	
	public InvalidCSVFormat(String inputLine)
	{
		super(MSG+inputLine);
		this.inputLine = inputLine;
		
	}
	public InvalidCSVFormat(String message, String inputLine)
	{
		super(message);
		this.inputLine = inputLine;
	}
	
	
	public String getInputLine() {
		return inputLine;
	}
	public void setInputLine(String inputLine) {
		this.inputLine = inputLine;
	}
	
	
}
