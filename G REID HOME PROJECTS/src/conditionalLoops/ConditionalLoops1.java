package conditionalLoops;

import java.util.Scanner;

public class ConditionalLoops1 
{

	public static void main(String[] args) 
	{
		
		/*
		Scanner key = new Scanner(System.in);
		int num = 0, sum = 0, noNums = 0;
		double avg = 0.0;
		char ans = 'Y';
		do
		{
		System.out.print("\n\tPlease enter a number: ");
		num = key.nextInt();
		sum += num;
		noNums++;
		System.out.print("\n\tDo you want to enter another number (Y/N):  ");
		ans = key.next().charAt(0);
		} while (ans == 'Y' || ans == 'y');
		
		Input an unknown number of integers.  Output the total and the average.  
		Terminate the series of numbers with -999 (this is not to be included in the 
		calculations)*/
		
		Scanner key = new Scanner(System.in);
			
		int num = 0, sum = 0, noNums = 0;
		double avg = 0.0;
		char ans = 'Y';
			
		do
		{	System.out.print("\n\tPlease enter a number: ");
			num = key.nextInt();
			sum += num;
			noNums++;
			System.out.print("\n\tDo you want to enter another number (Y/N):  ");
			ans = key.next().charAt(0);
		}	
		while (ans == 'Y' || ans == 'y');
		
		
		
		
		
	}

}
