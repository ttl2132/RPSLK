
/**
 * @author Tian Low ttl2132
 * The ScoreKeeper class keeps track of the scores and winning percentages.
 */
public class ScoreKeeper {
	private int computerWins;
	private int userWins;
	private int ties;
	public ScoreKeeper () {
		computerWins = 0;
		userWins = 0;
		ties = 0;
	}
	public void increaseComputerWins () {
		computerWins++;
	}
	public void increaseUserWins () {
		userWins++;
	}
	public void increaseTie () {
		ties++;
	}
	public double getUserWinPercent () {
		return 100.0*userWins/(computerWins + userWins);
	}
	public double getTiePercent () {
		return  100.0*ties/(computerWins + userWins + ties);
	}
	public int getComputerWins () {
		return computerWins;
	}
	public int getUserWins () {
		return userWins;
	}
	public int getTies () {
		return ties;
	}
}
