package loopExercises;
import java.util.Random;


public class loopEx4 
{
	public static void main(String[] args) 
	{
		/*Roll a die until the number six occurs. 
		 * Output each result and count the number of times the dice is rolled
		 */
		
		Random roll = new Random();
	
		int x = roll.nextInt(6)+1;
	
		System.out.print("\n\tyou have rolled: " +x);
	
		
	}
}

