package ca.bcit.comp1451.assignments0;

/**
 * This class displays all messages for the game
 * @author Cintia Ferrari Schutt de Assis
 * @version 07/07/2017
 */
public class Messages {			
	

	public void getInformation() {

		System.out.println("__________________________Welcome to SKUNK Game!!!____________________________");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("The game has 5 rounds, S, K, U, N, and K, in each round will roll 2 dice.");
		System.out.println("Your points are the sum of the dice's face.");
		System.out.println("When you roll two 6, you win 1000 points.");
		System.out.println("However, if you roll one 1 you lose all the points in that round and go to the next round.");
		System.out.println("If you roll two 1s, you lose all your points accumulated since the first round and go to the next round.");
		System.out.println("At each roll dice, you can continue in the current round, or you can go to the next round. ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("_____________________Let's start the game! Good Luck!_________________________");
		System.out.println();

	} // end of method getInformation()
	
	public void getTwo1s() {		
		System.out.println("Two dice with number 1, you lost all points until now.");			
	} // end of method getTwo1s()

	public void getOne1() {			
		System.out.println("One die with number 1, no points in this round.");		
	} // end of method getOne1() 

	public void getTwo6() { 			
		System.out.println("Good job! You win 1000 points with double 6!!");	
	} //end of method getTwo6()		

} // end of class Messages