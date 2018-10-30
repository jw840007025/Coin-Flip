/***********************************
	 * Student Name: Joshua Webb	
	 * Date Due: 10/31/2018
	 * Date Submitted: 10/29/2018
	 * Program Name: Heads or Tails
	 * Program Description:  Write a program 
	 * that lets the user continuously guess 
	 * whether the flip of a coin results in 
	 * heads or tails until the user wins. 
	 * The program randomly generates 
	 * an integer 0 or 1, which represents 
	 * head or tail. The program prompts 
	 * the user to enter a guess and reports 
	 * whether the guess is correct or incorrect. 
	 ****************************************/ 
import java.util.Scanner;
public class HomeworkFive {
	public static void main (String [] args) {
		
		
		System.out.print("Did your computer guess heads or tails?\n\n"
					+ "0 is heads and 1 is tails. Enter your guess here: ");
		Scanner input = new Scanner (System.in);
		
		
		
		float random = (float) Math.random();
		float multiplied = random *2;
		int computerFlip = (int)Math.floor(multiplied);
		
		String headsOrTails = Integer.toString(computerFlip);
		
		if (computerFlip == 1) {
			headsOrTails = "tails";
		} else if (computerFlip == 0) {
			headsOrTails = "heads";
		}
		
		//System.out.print((int)computerFlip);// prints computer's guess 1 or 0
		
		int userFlip;
		
		do {	
			userFlip = input.nextInt();
			String humanHeadsOrTails = Integer.toString(userFlip);
			
			if (computerFlip != userFlip) {
			
				System.out.println("\nYour computer guessed " + headsOrTails 
						+ ", which is the same as " + (int)computerFlip + ".");
				// prints computer's guess 1 or 0
				System.out.println("You lose!  Let's play again!");
				
			} else if (userFlip == computerFlip){
			
				System.out.println("\nYour computer guessed " + headsOrTails 
						+ ", which is the same as " + (int)computerFlip + ".");
				// prints computer's guess 1 or 0
				System.out.print("You win!  Let's play again!");
			}
		} while (computerFlip == userFlip || computerFlip != userFlip);
}
}
