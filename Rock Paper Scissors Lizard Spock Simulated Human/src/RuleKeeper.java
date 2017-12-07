
/**
 * @author Tian Low ttl2132
 * The RuleKeeper class determines who wins.
 */
public class RuleKeeper {
	private String result;
	public RuleKeeper() {
		result = "";
	}
	public void winChecker (Computer c, User s, ScoreKeeper k) {
		if (c.getComputerThrowNum() == s.getUserThrowNum()) {
			result = ("It's a Tie! We both entered" + c.getComputerResponse());
			k.increaseTie();
		} else if ((c.getComputerThrowNum()+2)%5==s.getUserThrowNum() || (c.getComputerThrowNum()+4)%5==s.getUserThrowNum()) {
			/*The logic behind the above line is that rock, paper, scissors, spock and lizard are numbered in this particular order,
			 *the choice thrown beats the responses that are two more and four more away counting forward in the order and loses against the other responses.
			 *If the number is 5 or more, the remainder of the value is taken, which allows the cycle to "loop" back to the start of rock, paper, scissors, spock, and lizard.
			 */
			result = ("You Lose! " + c.getComputerResponse() + " beats " + s.getUserResponse() + ".");
			k.increaseComputerWins();
		} else {
			result = ("You Win! " + s.getUserResponse() + " beats " + c.getComputerResponse() + ".");
			k.increaseUserWins();
		}
	}
	public String getResult () {
		return result;
	}
}
