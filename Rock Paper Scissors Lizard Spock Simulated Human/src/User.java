
/**
 * @author Tian Low ttl2132
 * The User Class is a simulated human whose strategy is to cyclically choose paper, scissors, spock, lizard, then rock.
 */
public class User {
	private int userThrowNum;
	private int userThrowCounter;
	private String userResponse;
	public User () {
		userThrowNum = 0;
		userResponse = "";
	}
	String [] userThrowOutcomes = {"Rock","Paper", "Scissors","Spock","Lizard"};
	public void interpretUserThrow () {
		userThrowCounter++;
		userThrowNum = userThrowCounter%5;
		userResponse = userThrowOutcomes[userThrowNum];
	}
	public int getUserThrowNum () {
		return userThrowNum;
	}
	public String getUserResponse () {
		return userResponse;
	}
}
