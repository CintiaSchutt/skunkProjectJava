package ca.bcit.comp1451.assignments0;

import java.util.Scanner;

/**
 * Class for the object Player
 * @author Cintia Ferrari Schutt de Assis
 * @version 07/07/2017
 *
 */
public class Player {	
	private String namePlayer;	
	private Scanner userInput = new Scanner(System.in);
		
	/**
	 * @param namePlayer 
	 */
	public Player() {	
		setNamePlayer(userInput);
	}	
	
	/**
	 * @return the namePlayer
	 */
	public String getNamePlayer() {
		return namePlayer;
	}	
	
	/**
	 * @param userInput
	 *            the namePlayer to set
	 */
	public void setNamePlayer(Scanner userInput) {
		this.namePlayer = userInput.toString();
	}	

	/**
	 * This method gets name of the player from keyboard
	 */
	public void getPlayerNameFromKeyboard() {
		System.out.println("Please, enter the player's name: ");

		if (userInput.hasNext()) {
			if((userInput != null) && (!userInput.equals(""))) {
				setNamePlayer(userInput);
			}			
		}			
	} // end of method getPlayerName()	

} // end of class Player
