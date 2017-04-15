import java.util.Scanner;

public class TwoPlayerRandomSize {
static Scanner input = new Scanner( System.in );
	
	public static int size;
	public static int option;
	public static int winner;
	
	public static void play() {
		
		winner = 0;
		
		System.out.println("\nYou have chosen random size mode."
				+ " Random size will be between 25 and 4.");
		
		size = (int) (4 + (Math.random() * (22)));

		while (winner == 0) { //loop until winner
			
			player1Turn();
			
			if (winner != 0) //check after first turn to see if there is a winner
				break;
			
			player2Turn();
		}
		
		switch (winner) {
		
			case 1: 
				System.out.println("Congratulations, player 1! You have won!!!");
				break;
			case 2: 
				System.out.println("Congratulations, player 2! You have won!!!");
				break;
		}
		input.nextLine(); input.nextLine();
	}
	
	public static void player1Turn() {
		
		System.out.println("Player 1, it is your turn:");
		option = input.nextInt();
		
		while (isWrong()) 
			option = input.nextInt();
		
		size -= option;
		
		if (size <= 0) 		
			winner = 1;
	}
	
	public static int player2Turn() {
		
		System.out.println("Player 2, it is your turn:");
		option = input.nextInt();
		
		while (isWrong()) 
			option = input.nextInt();
		
		size -= option;
		
		if (size == 0) 		
			winner = 2;
		
		return option;
	}
	
	public static boolean isWrong() {
		
		if (1 <= option && option <= 3) 			
			return false;
		
		else {
			System.out.println("\nYou have entered invalid input."
					+ " Please select only 1-3 marbles.");
			return true;
		}
	}
}