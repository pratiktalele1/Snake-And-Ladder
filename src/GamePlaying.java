import java.util.Scanner;

public class GamePlaying {
	public static void main(String[] args) {
	
		GameOperations.startPosition=0;
		GameOperations.roll();
		System.out.println("start game");
		while(GameOperations.player1!=100||GameOperations.player2!=100) {
			System.out.println("------------------------------------------");
			System.out.println("player first term - play move");
			Scanner scanInput1 = new Scanner(System.in);
			int getUserInput1 = scanInput1.nextInt();
			GameOperations.roll();
			GameOperations.player1=GameOperations.startPosition;
			if(GameOperations.player1==100) {
				System.out.println("player first win the game");
				break;
			}
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");

			System.out.println("player second term - play move");
			Scanner scanInput2 = new Scanner(System.in);
			int getUserInput2 = scanInput2.nextInt();
			GameOperations.roll();
			GameOperations.player2=GameOperations.startPosition;
			if(GameOperations.player2==100) {
				System.out.println("player second win the game");
				break;
			}
			System.out.println("------------------------------------------");
			
		}
	}
}
