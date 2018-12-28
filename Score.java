package ca.bcit.comp1451.assignments0;

/**
 * This class stores the score of the game
 * @author Cintia Ferrari Schutt de Assis
 * @version 07/07/2017
 */
public class Score {	
	private int totalScore;

	/**
	 * @return the totalScore
	 */
	public int getTotalScore() {			
		return totalScore;		
	}	

	/**
	 * @param totalScore
	 *            the totalScore to set
	 */	
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;		
	}

	/**
	 * 
	 * @param roundScore
	 */
	public void addScore(int roundScore) {
		this.totalScore = this.totalScore + roundScore;
	}
	
} // end of the class Score


