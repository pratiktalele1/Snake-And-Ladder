import java.util.Random;



public class GameOperations {
	public static int startPosition;
	public static int previousPosition;
	public static int count=0;
	
	public static void roll() {
		previousPosition=startPosition;
		startPosition=(int)Math.floor(Math.random()*6+1);
	}
		
	
}
