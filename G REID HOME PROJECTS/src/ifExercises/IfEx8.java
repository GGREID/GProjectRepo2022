package ifExercises;

import java.util.Scanner;

public class IfEx8 
{

	public static void main(String[] args) 
	{
		Scanner key =new Scanner(System.in);
		double shoeSz=0.0;
		System.out.println("shoe size?: ");
		shoeSz = key.nextInt();
		
		if(shoeSz == 10)
		{
			System.out.println("your feet are size 10");
		}
		else if(shoeSz == 11)
		{
			System.out.println("your feet are size 11");
		}
		else
		{
			System.out.println("go get them measured");
		}
		
		
	}
	
	
	
	

}
