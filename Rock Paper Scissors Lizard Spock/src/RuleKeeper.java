
/**
 * @author Tian Low ttl2132
 * The RuleKeeper class makes sure the rules of the game are being followed. The class checks to make sure the player is entering a valid response and provides the results of the round.
 */
public class RuleKeeper {
	private String result;
	public RuleKeeper() {
		result = "";
	}
	public boolean isNotValidResponse(String userInput) {
		if (userInput.equals("r") || userInput.equals("p") || userInput.equals("s") || userInput.equals("l") || userInput.equals("k") || userInput.equals("z"))
			return false;
		else
			return true;
	}
	public void winChecker (Computer c, User s, ScoreKeeper k) {
		if (c.getComputerThrowNum() == s.getUserThrowNum()) {
			result = "It's a Tie!";
			k.increaseTie();
		} else if ((c.getComputerThrowNum()+2)%5==s.getUserThrowNum() || (c.getComputerThrowNum()+4)%5==s.getUserThrowNum()) {
			/*The logic behind the above line is that rock, paper, scissors, spock and lizard are numbered in this particular order,
			 *the choice thrown beats the responses that are two more and four more away counting forward in the order and loses against the other responses.
			 *If the number is 5 or more, the remainder of the value is taken, which allows the cycle to "loop" back to the start of rock, paper, scissors, spock, and lizard.
			 */
			result = "You Lose!";
			k.increaseComputerWins();
		} else {
			result = "You Win!";
			k.increaseUserWins();
		}
	}
	public String getResult () {
		return result;
	}
}
