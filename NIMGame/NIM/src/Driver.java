/* Zachary Betters
 * 3/31/17
 * NIM Program Simulation
 * 
 * 4/3/17 Update: -Created separate classes to handle separate sections.
 * 				  -Added easy and hard mode for single player. 
 * 				  -Display '0' if size of marbles is 0.
 * 				  -Changed 'ball' to 'marble.'
 * 				  -Changed default size in ONE PLAYER MODE to 16.
 * 
 */

public class Driver {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		menu.mainMenu();
	}
}