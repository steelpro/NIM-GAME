import java.util.Scanner;

public class Instructions {
	
	static Scanner input = new Scanner (System.in);
	
	public static void instructions() {
		
		System.out.println("\nABOUT:\nThis game is called NIM. "
				
				+ "This is a computer only version of an old 1960s board game 'Dr NIM.'\n"
				+ "Players are presented with a set number of 'marbles'. These marbles are represented as ' * '.\n"
				+ "The players may take 1-3 marbles for each turn they get.\n"
				+ "For example: player 1 goes first, and he decides to take 1 marble. Player 2 goes next, and he takes 2.\n"
				+ "Both players continue swapping their turns until the last marble is reachable.\n"
				+ "Whoever takes the last marble wins the game.\n\n"
			
				+ "ONE PLAYER MODE:\nThe user goes first and types in a number from 1-3 to decide how many marbles he takes.\n"
				+ "After the player decides, the computer will do the same.\n"
				+ "Both the player and the computer will swap turns until the last marble is reachable.\n"
				+ "Whoever takes it wins the game.\n\n"
			
				+ "TWO PLAYER MODE:\nThe user to go first is decided by the players themselves.\n"
				+ "Each player will take a turn entering a number between 1-3 to see how many marbles they receive.\n"
				+ "Whoever takes the last marble wins the game.\n"
				
				+ "\nHIT THE ENTER KEY TO EXIT INSTRUCTIONS");
		
		input.nextLine();
	}
}