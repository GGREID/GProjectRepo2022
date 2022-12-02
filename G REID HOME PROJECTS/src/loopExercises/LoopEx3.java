package loopExercises;

import java.util.Scanner;

public class LoopEx3 
{

	public static void main(String[] args) 
	{
		/*Input of the height a ball is dropped from.  
		 * Assuming that on each bounce the height reached reduces by 5%, 
		 * output the number of bounces that occur before the ball stops bouncing.
		 */
		Scanner key = new Scanner(System.in);
		
		double height =0, bounces =0;
		
		System.out.print("\n\tinput height ball is dropped from: ");
		height = key.nextInt();
		
		while (height >=.1)
		{
		height = (height/100*95);
		
		System.out.print("\n\tIt took "+ bounces);
		
		bounces++;
		
		System.out.print("\n\t height = " +height );
		}
		
	}

}
