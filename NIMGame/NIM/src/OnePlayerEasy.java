import java.util.Scanner;

public class OnePlayerEasy {
	
	static Scanner input = new Scanner(System.in);
	
	public static int size;
	public static int option;
	public static int winner;
	
	public static void play() {
		
		winner = 0; //winner set to 0, so no winner now 
		size = 16; //size can be changed, but should be kept at a multiple of 4
		
		System.out.println("\nYou have chosen easy mode");
		
		showBalls(); 
		
		while (winner == 0) { //loop until a player has won
			
			playerTurn(); //call player turn method
			
			if (winner == 1) //if player has won, break loop so computer turn isn't called
				break; //no else statement because of break 
			
			computerTurn(); //call computer turn
		}
		
		switch (winner) {
			case 1: //if player has won
				System.out.println("Congratulations! You have beaten me!!!");
				break;
				
			case 2: //if computer has won
				System.out.println("Oh, I'm sorry. I have taken the last marble. Better luck next time!");
				break;
		}
		input.nextLine(); input.nextLine();
	}
	
	public static void playerTurn() {
		
		System.out.println("Player, it is your turn:");
		option = input.nextInt(); //store player decision 
		
		while ( isWrong() ) //keep asking player for number until it is valid
			option = input.nextInt();
		
		size -= option; //change amount of marbles based on option 
		
		if (size <= 0) //if no marbles left, player has won		
			winner = 1;
	}
	
	public static void computerTurn() {

		if (size <= 3) { //if last marble is reachable, execute following code
			int selection = size; //computer will pick all the marbles remaining 
			System.out.println("It appears that the final marble is reachable. I will sellect " + selection + " marble(s).");
			size -= selection; 
			winner = 2; //winner set to 2 for computer 
		}
		
		else { 
			
			if ((size - option) % 4 == 0) {
				int selection = 4 - option; //computer designed to make amount of marbles a multiple of 4
				
				System.out.println("It is my turn:\nI will select " + selection + " marble(s).");
			
				size -= selection; //size will always be subtracted by 4, thus keeping it a multiple of 4	
			}
			else {
	
				int selection = 1 + (int) (Math.random() * ((3 - 1) + 1)); //random selection
			
				System.out.println("It is my turn:\nI will select " + selection + " marble(s).");
			
				size -= selection; //size will always be subtracted by 4, thus keeping it a multiple of 4
			}
		}
		
		showBalls();
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
	
	public static boolean isWrong() { //method to test player decision 
		
		if (1 <= option && option <= 3) //if option is within range  			
			return false;
		
		else {
			System.out.println("\nYou have entered invalid input. Please select only 1-3 marbles.");
			return true;
		}
	}
}