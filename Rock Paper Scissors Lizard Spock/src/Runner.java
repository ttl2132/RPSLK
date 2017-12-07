import java.util.Scanner;

/**
 * @author Tian Low  ttl2132
 * The Runner class runs the game.
 */
public class Runner {

	public static void main(String[] args) {
		String userLetter;
		Scanner prompter = new Scanner(System.in);
		Reporter reporter = new Reporter();
		ScoreKeeper scoreKeeper = new ScoreKeeper();
		RuleKeeper ruleKeeper = new RuleKeeper();
		reporter.displayWelcomeMessage();
		while (true) {
			userLetter = prompter.next();
			while (ruleKeeper.isNotValidResponse(userLetter)) {
				reporter.displayErrorMessage();
				userLetter = prompter.next();
			}
			if (userLetter.equals("z"))
				break;
			User player = new User(userLetter);
			Computer computer = new Computer();
			player.interpretUserThrow(userLetter, reporter);
			computer.interpretComputerThrowNumObject();
			ruleKeeper.winChecker(computer, player, scoreKeeper);
			reporter.displayRoundThrows(computer, player);
			reporter.displayRoundResults(ruleKeeper);
			reporter.displayResults(scoreKeeper);
		}
		reporter.displayEndGame(scoreKeeper);
	}

}