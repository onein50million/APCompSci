package chapter3_8;

/**
 * @author Daniel Wart
 * @version 1
 *
 */
public class VotingMachine {

	int republican = 0;
	int democrat = 0;

	
	
	/**
	 * sets vote tally to 0
	 */
	public void reset() {
		this.republican = 0;
		this.democrat = 0;
	}
	
	/**
	 * adds one vote to Republican
	 */
	public void addRepublican() {
		this.republican++;
	}
	/**
	 * add one vote to Democrat
	 */
	public void addDemocrat() {
		this.democrat++;
	}

	/**
	 * @return number of Republican votes
	 */
	public int getRepublican() {
		return republican;
	}
	/**
	 * @return number of Democrat votes
	 */
	public int getDemocrat() {
		return democrat;
	}
	
}
