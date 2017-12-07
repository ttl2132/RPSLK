
/**
 * @author Tian Low ttl2132
 * The Reporter class prints messages to the console that the player will read, including rules, errors, and results.
 */
public class Reporter {
	public Reporter() {
		
	}
	
	public void displayWelcomeMessage () {
		System.out.println("Welcome to Rock Paper Scissors Lizard Spock! \nRules: Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, Spock smashes scissors, scissors decapitates lizard, lizard eats paper, "
				+ "\npaper disproves Spock, Spock vaporizes rock, and rock crushes scissors. \nEnter 'r' for rock, 'p' for paper, 's' for scissors, 'k' for spock, or 'l' for lizard to begin. Entering 'z' ends the game.");
	}
	
	public void displayErrorMessage () {
		System.out.println("INVALID. Type response again.");
	}
	
	public void displayResults (ScoreKeeper s) {
		System.out.println("Computer: " + s.getComputerWins() + " User: " + s.getUserWins() + " Ties: " + s.getTies());
	}
	
	public void displayRoundThrows (Computer c, User u) {
		System.out.println("You threw: " + u.getUserResponse());
		System.out.println("The Computer threw: " + c.getComputerResponse());	
	}
	
	public void displayRoundResults (RuleKeeper r) {
		System.out.println(r.getResult());
	}
	
	public void displayEndGame (ScoreKeeper s) {
		System.out.println("These are the final results.");
		displayResults(s);
		System.out.println("Win Percentage: " + s.getUserWinPercent());
		System.out.println("Tie Percentage: " + s.getTiePercent());
		System.out.println("Ties are supposed to be about 33% of the total rounds. Did your 'strategy' work? Probably not!");
	}
}
