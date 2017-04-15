import java.util.Scanner;

public class MainMenu {
	
	static Scanner input = new Scanner(System.in);
	
	public void mainMenu() {
				
		clearContent();
		System.out.println("Welcome to NIM!");	
		
		boolean valid = true;
		
		while (valid) { //valid will always be true, so loop goes until user enters 4
			
			System.out.println("\nPlease type on your keyboard an option and then hit enter:");
			
			System.out.println("(1): ONE PLAYER MODE\n(2): TWO PLAYER MODE\n(3): INSTRUCTIONS\n(4): QUIT");
			int choice = 0;
			
			try { choice = input.nextInt(); } //store user input 
			catch (Exception e) {
				System.out.println("You have entered an invalid selection.\n"
						+ "This program will now end.");
				break;
			}
			
			switch (choice) { //call actions based on user input 
			
				case 1: 
					clearContent();
					onePlayerSelection(); //call class to simulate player 1 mode 
					break;
					
				case 2: 
					clearContent();
					twoPlayerSelection(); //call two player menu 
					break;
				
				case 3: 
					clearContent();
					Instructions.instructions(); //call class to print instructions
					clearContent();
					break;
					
				case 4:
					System.out.println("So long and thanks for all the fish!");
					System.exit(1); //close entire program
					break;
					
				default: //error if user enters number other than given
					System.out.println("You have entered an unrecognized choice. "
							+ "Please be sure to enter a valid option");
					break;
			}
		}
	}
	
	public static void onePlayerSelection() {
		
		System.out.println("\nYou have chosen ONE PLAYER MODE\n"
				+ "What mode would you like the computer to play on: EASY or HARD (e or h)?");
		
		String selection = input.next();
		
		boolean valid = true;
		while (valid) {
			
			switch (selection) {
			
				case "e": 
					clearContent(); 
					OnePlayerEasy.play();
					clearContent();
					valid = false; 
					break;
					
				case "h": 
					clearContent();
					OnePlayerHard.play(); 
					clearContent();
					valid = false;  
					break;
				
				default: 
					System.out.println("You have chosen an invalid selection.");
					valid = false;
					break;
			}
		}
	}
	
	public static void twoPlayerSelection() {
		
		System.out.println("\nYou have chosen TWO PLAYER MODE\n"
				+ "Would you like the size to be randomly generated (y or n)?");
		
		String selection = input.next();
		
		boolean valid = true;
		while (valid) {
			
			switch (selection) {
			
				case "n": 
					clearContent(); 
					TwoPlayerPickSize.play(); 
					clearContent();
					valid = false; 
					break;
					
				case "y": 
					clearContent();
					TwoPlayerRandomSize.play(); 
					clearContent();
					valid = false;  
					break;
				
				default: 
					System.out.println("You have chosen an invalid selection.");
					valid = false;
					break;
			}
		}
	}
	
	public static void clearContent() {
		
		for(int clear = 0; clear < 200; clear++) 
			System.out.println("\n") ;
	}
}