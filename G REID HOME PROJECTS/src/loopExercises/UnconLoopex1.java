package loopExercises;

import java.util.Scanner;

public class UnconLoopex1 {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
    	
		int number, total, count;
		        	double average;

		        	total = 0;
		        	count = 0;

		       	 System.out.print("\n\n\tPlease input a number:  ");
		        	number = key.nextInt();

		        	while (number != -999)
		        	{
		            		total = total + number;
		            		count = count + 1;
		            		System.out.print("\n\tPlease input a number:  ");
		           		number = key.nextInt();
		       	 }

		        	average = total / count;
		       	 System.out.print("\n\n\n\tThe total is " + total);
		        	System.out.print("\tThe average is " + average);
			}
		}

