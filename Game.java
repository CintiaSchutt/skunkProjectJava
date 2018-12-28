package ca.bcit.comp1451.assignments0;

import java.util.Scanner;

/** 
 * Class for to play the game
 * @author Cintia Ferrari Schutt de Assis
 * @version 07/07/2017
 */
public class Game {

	private Player player = new Player();
	private Messages messagesGame = new Messages();
	private Round roundList = new Round();
	private Scanner scan = new Scanner(System.in);
	private Die die1 = new Die(6);
	private Die die2 = new Die(6);
	private Score gameScore = new Score();
	private Score roundScore = new Score();
	private String currentRound;	
	private boolean continueRound = false;	
	

	/**
	 * This method calls getInformation() with the explanation of rules, also calls getPlayerNameFromKeyboard()
	 * 
	 */
	public void getGameInfo() {		
		messagesGame.getInformation();
		player.getPlayerNameFromKeyboard();		

	} // end of method getGameInfo()	
	
	/**
	 *  This method goes through all rounds rolling the dice and getting the score
	 */
	public void getPlayingGame() {			
		for (int i = 0; i < roundList.getSize(); i++) {
			currentRound = roundList.getRound(i);

			do {
				die1.rollDie();
				die2.rollDie();

				System.out.println("Round: " + currentRound);
				System.out.println("First die: " + die1.getFaceValue());
				System.out.println("Second die: " + die2.getFaceValue());
				
				diceVerification();
				
			} while (continueRound);

			gameScore.addScore(roundScore.getTotalScore());
			roundScore.setTotalScore(0);
		}
	} // end of method getPlayingGame()	
	
	/**
	 * This method verify according to the dice faceValue which score to apply
	 */
	public void diceVerification() {
		if ((die1.getFaceValue() == die1.getFirstDieNumber()) && (die2.getFaceValue() == die2.getFirstDieNumber())) {
			messagesGame.getTwo1s();
			roundScore.setTotalScore(0);
			gameScore.setTotalScore(0);
			System.out.println("Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = false;
		} else if ((die1.getFaceValue() == die1.getFirstDieNumber()) || (die2.getFaceValue() == die2.getFirstDieNumber())) {
			messagesGame.getOne1();
			roundScore.setTotalScore(0);
			System.out.println("Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = false;
		} else if ((die1.getFaceValue() == die1.getLastDieNumber()) && (die2.getFaceValue() == die2.getLastDieNumber())){
			messagesGame.getTwo6();
			roundScore.addScore(1000);
			System.out.println("Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = validationContinueRound(currentRound);
		} else {
			int sumFaces = die1.getFaceValue() + die2.getFaceValue();
			roundScore.addScore(sumFaces);
			System.out.println("Sum of faces: " + sumFaces + " | Round Score: " + roundScore.getTotalScore() + " | Game Score:  " + gameScore.getTotalScore());
			System.out.println();
			continueRound = validationContinueRound(currentRound);
		}		
	} // end of the method diceVerification()
	
	/**
	 * This method makes the validation if the player will continue in the same round
	 * @param round
	 * @return true if the player continues in the same round 
	 */
	public boolean validationContinueRound(String round) {
		boolean continueRound = false;
		System.out.println("Continue in the same round? (y/n)");
		while (scan.hasNext()) {
			String userInput = scan.next();			
			if (userInput.equalsIgnoreCase("y")) {
				continueRound = true;
				break;
			} else if (userInput.equalsIgnoreCase("n") && round.equalsIgnoreCase("K.")) {				
				continueRound = false;
				break;
			} else if (userInput.equalsIgnoreCase("n")) {
				System.out.println("You choose change the round.");
				continueRound = false;
				break;
			} else {
				System.out.println("Please, type only Y or N.");
			}
		}
		return continueRound;
	} // end of method validationContinueRound()

	/**
	 * This method presents the final score of the player
	 */
	public void getDetailsFinalGame() {

		System.out.println("--------------Game over!--------------");
		System.out.println("Congratulations!!!!!");
		System.out.println("Total game: " + gameScore.getTotalScore());

	} // end of method getDetailsFinalGame()
	
} // end class Game
