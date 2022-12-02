package loopExercises;

import java.util.Random;

public class LoopEX4a 
{

	public static void main(String[] args) 
	{	
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		
		while ((x>=5) && (x<=7))
		
		System.out.print("\n\tyou have rolled: " +x);
	
		
	}

}
