package array1D;

import java.util.Scanner;

public class Array1DEx1 
{

	public static void main(String[] args) 
	{	
		Scanner key = new Scanner(System.in);
		int[] numbers = new int[10];
		// for loop to pass in 10 element integer values
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("please assign an integer to array element " + i + ": ");
			numbers[i] =  key.nextInt();
		}
		//for loop to pass out 10 array element values in reverse
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i]);
		}
	}

}
/*Prompt the user for 10 integer values and store them in an array.  When they have 
finished, output all of the numbers in reverse order.
*/