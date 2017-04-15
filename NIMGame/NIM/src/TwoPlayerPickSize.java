import java.util.Scanner;

public class TwoPlayerPickSize {
static Scanner input = new Scanner( System.in );
	
	public static int size;
	public static int option;
	public static int winner;
	
	public static void play() {
		
		winner = 0;
		
		System.out.println("\nEnter amount of marbles to be in play:");
		size = input.nextInt(); //2 player mode lets you change how many marbles are in play

		while (isNotValid()) 
			size = input.nextInt(); //keep asking player until amount is not less than 0
		
		showBalls();
		
		while (winner == 0) { //loop until winner
			
			player1Turn();
			showBalls();
			
			if (winner != 0) //check after first turn to see if there is a winner
				break;
			
			player2Turn();
			showBalls();
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
	
	public static void showBalls() { //method to display marbles left in play 
		
		System.out.println("\nCURRENT marbles IN PLAY (" + size + "):");
		
		if (size != 0) {
			for (int i = 0; i < size; i++) //print statement same amount as marbles in play
				System.out.print(" * ");
		}
		else
			System.out.println("0");
		
		System.out.println();
	}
	
	public static boolean isNotValid() {
		
		if (size > 1) 
			return false;
		
		else {
			System.out.println("\nYou have entered an invalid amount of marbles to be in play."
					+ "Please select a number over 0.");
			return true;
		}	
	}
	
	public static boolean isWrong() {
		
		if (1 <= option && option <= 3) 			
			return false;
		
		else {
			System.out.println("\nYou have entered invalid input."
					+ "Please select only 1-3 marbles.");
			return true;
		}
	}
}