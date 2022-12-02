package ifExercises;
import java.util.*;
public class IfEx4 {

	public static void main(String[] args) 
	{
			Scanner key = new Scanner(System.in);
		
		int testScore = 0;

			//Input test score
			System.out.print("\n\n\tPlease enter test score: ");
			testScore = key.nextInt() ;

			//Validate test score and determine output
		if ((testScore < 0) || (testScore > 200))
		{
			System.out.print("\n\tInvalid score entered");
			System.out.print("\n\tPlease re-run the program with a valid score!");
		}
		else if 
			(testScore > 100)
			System.out.print("\n\n\tAbove Average");
		
		else if 
			(testScore == 100)
			System.out.print("\n\n\tAverage");
			
		else
			System.out.print("\n\n\tBelow Average");
	}
}

