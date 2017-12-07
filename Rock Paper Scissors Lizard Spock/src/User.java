
/**
 * @author Tian Low ttl2132
 * The User Class interprets the user's input and provides the resulting answer of rock, paper, lizard, scissors, or spock.
 */
public class User {
	private int userThrowNum;
	private String userResponse;
	public User (String userInput) {
		userThrowNum = 0;
		userResponse = userInput;
	}
	
	public void interpretUserThrow (String userLetter, Reporter reporter) {
		switch(userLetter) {
		case "r":
			userThrowNum = 0;
			userResponse = "Rock";
			break;
		case "p":
			userThrowNum = 1;
			userResponse = "Paper";
			break;
		case "s":
			userThrowNum = 2;
			userResponse = "Scissors";
			break;
		case "k":
			userThrowNum = 3;
			userResponse = "Spock";
			break;
		case "l":
			userThrowNum = 4;
			userResponse = "Lizard";
			break;
		}
	}
	public int getUserThrowNum () {
		return userThrowNum;
	}
	public String getUserResponse () {
		return userResponse;
	}
}
