package switchExercises;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) 
	{
		/*Write a program which prompts the user to input an integer value for the Month (1-
		12).  Using a switch statement, print out the month name (January, February, etc...) 
		and how many days are in the month. If the integer value does not represent a valid 
		month  (1-12),  the  program  should  print  out  an  error  message  “Invalid  month:  xx” 
		(where xx is the value entered)*/
		
		Scanner key = new Scanner(System.in);
		
		int num=0,jan=1,feb=2,march=3,apr=4,may=5,june=6,july=7,aug=8,sept=9,oct=10,nov=11,dec=12;
		
		System.out.print("\n\tCHOOSE A MONTH 1-12:\n\t1 JAN\n\t2 FEB\n\t3 MARCH\n\t4 APR\n\t5 MAY\n\t6 JUNE\n\t7 JULY"
				+ "\n\t8 AUG\n\t9 SEPT\n\t10 OCT\n\t11 NOV\n\t12 DEC");
		
		num = key.nextInt();
		
			switch(num)
			{
			case 1: System.out.print("\n\tYou have chosen JANUARY");
			System.out.print("\n\tThis month has 31 days");
			break;
	
			case 2: System.out.print("\n\tYou have chosen FEBRUARY");
			System.out.print("\n\tThis month has 28 1/4 days. "
					+ "\n\tFebruary is the second month of the year in the Julian and Gregorian calendars. "
					+ "\n\tThe month has 28 days in common years or 29 in leap years, with the 29th day being called the leap day. "
					+ "\n\tIt is the first of five months not to have 31 days "
					+ "\n\t(the other four being April, June, September, and November) and the only one to have fewer than 30 days.");
			break;
	
			case 3: System.out.print("\n\tYou have chosen MARCH");
			System.out.print("\n\tThis month has 31 days");
			break;
	
			case 4: System.out.print("\n\tYou have chosen APRIL");
			System.out.print("\n\tThis month has 30 days");
			break;
	
			case 5: System.out.print("\n\tYou have chosen MAY 5");
			System.out.print("\n\tThis month has 31 days");
			break;
		
			case 6: System.out.print("\n\tYou have chosen JUNE");
			System.out.print("\n\tThis month has 30 days");
			break;
		
			case 7: System.out.print("\n\tYou have chosen JULY");
			System.out.print("\n\tThis month has 31 days");
			break;
		
			case 8: System.out.print("\n\tYou have chosen AUGUST");
			System.out.print("\n\tThis month has 31 days");
			break;
	
			case 9: System.out.print("\n\tYou have chosen SEPTEMBER");
			System.out.print("\n\tThis month has 30 days");
			break;
	
			case 10: System.out.print("\n\tYou have chosen OCTOBER");
			System.out.print("\n\tThis month has 31 days");
			break;
		
			case 11: System.out.print("\n\tYou have chosen NOVEMBER");
			System.out.print("\n\tThis month has 30 days");
			break;
		
			case 12: System.out.print("\n\tYou have chosen DECEMBER");
			System.out.print("\n\tThis month has 31 days");
			break;
		
			default: System.out.print("\n\tInvalid month: "+num);
			}
	}
}
