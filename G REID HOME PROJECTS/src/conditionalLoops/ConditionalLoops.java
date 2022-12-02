package conditionalLoops;

import java.util.Scanner;

public class ConditionalLoops 
{

	/*1Input an unknown number of integers.  Output the total and the average.  
	Terminate the series of numbers with -999 (this is not to be included in the 
	calculations).
	2. Rewrite the program in Exercise 1 to ask the user if they wish to enter another 
	number (use Y or N) and terminate when the user enters N. 
	3. Input of the height a ball is dropped from.  Assuming that on each bounce the 
	height reached reduces by 5%, output the number of bounces that occur before 
	the ball stops bouncing.
	4. Roll a die until the number six occurs. Output each result and count the number 
	of times the dice is rolled. 
	5. Input the call duration of an unknown number of calls in a call centre in minutes 
	and seconds and output:-
	(a) Total duration of all calls in minutes and seconds
	(b) The average call duration in minutes and seconds
	6. Input name and module result for an unknown no of students (but more than 4).  
	Determine and print their module grade based on the following:-
	Result Grade
	Below 40 Referred
	40 –59 Pass
	60 – 74 Merit
	75 – 100 Distinction
	Calculate and print the number of referrals, passes, merits, distinctions.
	Calculate and print the percentage of referrals, passes, merits, distinctions.
	(Validate the entry of a students result to be a number between 0 and 100)*/
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
			Scanner key = new Scanner(System.in);
			int num = 0, sum = 0, noNums = 0;
			double avg = 0.0;
			char ans = 'Y';
																						/*do
																						{
																						System.out.print("\n\tPlease enter a number:  
																						");
																						num = key.nextInt();
																						sum += num;
																						noNums++;
																						System.out.print("\n\tDo you want to enter 
																						another number (Y/N):  ");
																						ans = key.next().charAt(0);
																						} while (ans == 'Y' || ans == 'y');*/
			while (ans == 'Y' || ans == 'y')
			{
				System.out.print("\n\tPlease enter a number: ");
				num = key.nextInt();
				sum += num;
				noNums++;
				System.out.print("\n\tDo you want to enter another number (Y/N):  ");
				ans = key.next().charAt(0);
			}
				avg = (double)sum / noNums;
				System.out.print("\n\tAverage:  " + avg);
	}
		

}


