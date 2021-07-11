import java.util.Random;



public class GameOperations {
	public static int startPosition;
	public static int previousPosition;
	public static int diesNumber;
	public static int count=0;
	public static int player1=0;
	public static int player2=0;
	
	public GameOperations() {
		while(player1!=100||player2!=100) {
			roll();
		}
	}
	
	public static void roll() {
		
		diesNumber=(int)Math.floor(Math.random()*6+1);
		System.out.println("dies got -"+diesNumber);
		count++;
		option();
	}
	
	public static void option() {
		int option=(int)Math.floor(Math.random()*3+1);
		nextMove(option);
	}
	
	public static void nextMove(int option) {
		
		switch (option) {
		case 1:{
			//No play
			System.out.println("no play player at - "+startPosition);
			break;
			}
		case 2:{
			//next position
			startPosition=startPosition+diesNumber;
			if(startPosition>=100) {
				startPosition=100;
			}
			System.out.println("next location of player - "+startPosition);
			
			break;
			}
		case 3:{
			//snake bite
			startPosition=startPosition-diesNumber;
			if(startPosition<=0) {
				startPosition=0;
			}
			System.out.println("player at - "+startPosition);
			break;
			}
		}
		if(startPosition!=100)
		{
		roll();
		}
	}
		
}
