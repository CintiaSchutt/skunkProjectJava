package ca.bcit.comp1451.assignments0;

import java.util.Random;

/**
 *  Class for the object dice
 * @author Cintia Ferrari Schutt de Assis
 * @version 07/07/2017
 *
 */
public class Die {
	private int numberOfSides;
	private int faceValue;	
	private final int FIRST_DIE_NUMBER = 1;
	private final int LAST_DIE_NUMBER = 6;

	/**
	 * This constructor takes numberOfSides of the die as argument
	 * 
	 * @param numberOfSides
	 */
	public Die(int numberOfSides) {		
		this.numberOfSides = numberOfSides;
	} // end of constructor

	/**
	 * This method will roll the Die
	 */
	public void rollDie() {
		Random random = new Random();
		faceValue = 1 + random.nextInt(numberOfSides);
	} // end of method rollDie()

	/**
	 * This method will return the current face value of Dice
	 * 
	 * @return faceValue
	 */
	public int getFaceValue() {
		return faceValue;
	} // end of method getFaceValue()
	
	/**
	 * @return the firstDieNumber
	 */
	public int getFirstDieNumber() {
		return FIRST_DIE_NUMBER;
	}

	/**
	 * @return the lastDieNumber
	 */
	public int getLastDieNumber() {
		return LAST_DIE_NUMBER;
	}	

} // end of class Die


