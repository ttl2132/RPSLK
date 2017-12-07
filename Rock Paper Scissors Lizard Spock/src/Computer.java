import java.util.Random;

/**
 * @author Tian Low ttl2132
 * The Computer class generates and interprets the computer's actions to randomly produce either rock, paper, scissors, lizard or spock.
 */
public class Computer {
	private int computerThrowNum;
	private String computerResponse;
	public Computer () {
		Random numGenerator = new Random();
		computerThrowNum = numGenerator.nextInt(5);	
	}
	public void interpretComputerThrowNumObject() {
		switch(computerThrowNum) {
			case 0:
				computerResponse = "Rock";
				break;
			case 1:
				computerResponse = "Paper";
				break;
			case 2:
				computerResponse = "Scissors";
				break;
			case 3:
				computerResponse = "Spock";
				break;
			case 4:
				computerResponse = "Lizard";
				break;
		}
	}
	public int getComputerThrowNum () {
		return computerThrowNum;
	}
	public String getComputerResponse () {
		return computerResponse;
	}
}
