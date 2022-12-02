package switchExercises;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) 
	{
		/*Create a program which takes in the day of the week (1 - Monday, 2 - Tuesday, etc) 
		and prints out whether the day is a weekday (1-5) or a weekend (6-7).*/ 

		Scanner key = new Scanner(System.in);
		
		int day=0,monday=0,tuesday=0,wednesday=0,thursday=0,friday=0,saturday=0,sunday=0;
		
		System.out.print("\n\tCHOOSE A DAY 1-7:\n\t1 monday\n\t2 tuesday\n\t3 wednesday\n\t4 thursday\n\t5 friday\n\t6 saturday\n\t7 sunday");
		
		day = key.nextInt();
		
			switch(day)
		{
			case 1: System.out.print("\n\tYou have chosen monday 1");
			System.out.print("\n\tweekday");
			break;
	
			case 2: System.out.print("\n\tYou have chosen tuesday 2");
			System.out.print("\n\tweekday");
			break;
	
			case 3: System.out.print("\n\tYou have chosen wednesday 3");
			System.out.print("\n\tweekday");
			break;
	
			case 4: System.out.print("\n\tYou have chosen thursday 4");
			System.out.print("\n\tweekday");
			break;
	
			case 5: System.out.print("\n\tYou have chosen friday 5");
			System.out.print("\n\tweekday");
			break;
		
			case 6: System.out.print("\n\tYou have chosen saturday 6");
			System.out.print("\n\tweekend");
			break;
		
			case 7: System.out.print("\n\tYou have chosen sunday 7");
			System.out.print("\n\tweekend");
			break;
		
			default: System.out.print("\n\tERROR--THAT IS NOT AN OPTION. CHOOSE AGAIN 1-7 "); 
		}	
	}
}
