/**
 * @author Tian Low ttl2132
 * The Runner class runs the game with a simulated human. The number of rounds that seemed to be enough to get reliable results was 40.
 */
public class Runner {

	public static void main(String[] args) {
		Reporter reporter = new Reporter();
		ScoreKeeper scoreKeeper = new ScoreKeeper();
		RuleKeeper ruleKeeper = new RuleKeeper();
		User player = new User();
		reporter.displayWelcomeMessage();
		int enoughRounds = 40;
		for (int i = 0; i<enoughRounds; i++) {
			Computer computer = new Computer();
			player.interpretUserThrow();
			computer.interpretComputerThrowNumObject();
			ruleKeeper.winChecker(computer, player, scoreKeeper);
			reporter.displayRoundResults(ruleKeeper);
			reporter.displayResults(scoreKeeper);
		}
		reporter.displayEndGame(scoreKeeper);
	}

}