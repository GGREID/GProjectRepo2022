package unconditionalLoops;

import java.util.Scanner;

public class UnconditionalLoopex9 
{

	public static void main(String[] args) 
	{
		/*Input the weight of five students in Kilograms and Grams and output:
			(a) Total Weight of the Students in Kilogram and Grams
			(b) The average Weight of the Students in Kilograms and Grams*/
		
		Scanner key = new Scanner(System.in);
	
		double Mins = 0, Secs = 0, sumMins = 0, sumSecs = 0, totalSeconds = 0, totalMins = 0;		
		int Calls = 0;		
		char yesNo = ' ';
			
		do 
		{
			
			Calls++;
			System.out.print("\n\n\tMinutes of call: ");
			Mins = key.nextDouble();
			System.out.print("\n\tSeconds of call: ");
			Secs = key.nextDouble();
			System.out.print("\n\tWould you like to enter another call? USE CAPS (Y/N)");
			yesNo = key.next().charAt(0);
			
			sumMins += Mins;
			sumSecs += Secs;
			
		}	while (yesNo != 'N');
		
		totalSeconds = (((sumMins * 60) + sumSecs)%60);
		totalMins = (sumMins + (sumSecs / 60));
		
		System.out.printf("\n\tTotal, %.0f Mins and %.0fseconds: ", totalMins, totalSeconds);
		{
			
		}
		
		
		
	}

}
