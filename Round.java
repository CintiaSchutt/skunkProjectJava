package ca.bcit.comp1451.assignments0;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates an ArrayList with each round
 * @author Cintia Ferrari Schutt de Assis
 * @version 07/07/2017
 */
public class Round {	
	private List<String> totalRounds;		
	
	/**
	 * The constructor populates the ArrayList
	 */
	public Round() {
		totalRounds = new ArrayList<String>();
		
		totalRounds.add("S");
		totalRounds.add("K");
		totalRounds.add("U");
		totalRounds.add("N");
		totalRounds.add("K.");
	} // end of the constructor
	
	/**
	 * 
	 * @return the size of totalRounds
	 */
	public int getSize() {
		return totalRounds.size();
	}
	
	public String getRound(int index) {
		return totalRounds.get(index);
	}

	/**
	 * @return the totalRounds
	 */
	public List<String> getTotalRounds() {
		return totalRounds;
	}	

	/**
	 * @param totalRounds the totalRounds to set
	 */
	public void setTotalRounds(List<String> totalRounds) {
		this.totalRounds = totalRounds;
	}	
	
} // end of class Round
