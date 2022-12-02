package methods;

import general.*;

public class MethodsEx2 {

	public static void main(String[] args) 
	{
		int no1 = 0, no2 = 0;
		for (int i = 0; i >= 0; i++) 
		{

			no1 = myVal.validInt("\n\tPlease enter a number 1:  ");
			no2 = myVal.validInt("\n\tPlease enter number 2:  ");
			System.out.print("\n\tResult " + multiple(no1, no2));
		}
	}

	public static boolean multiple(int numA, int numB) 
	{
		boolean result = false;

		if (numA % numB == 0)
			result = true;

		return result;
	}
}

/*
 * 2. Write and test a method multiple that determines for a pair of integers
 * whether the second integer is a multiple of the first. The method should take
 * two integer arguments and return true if the second is a multiple of the
 * first, false otherwise. Use this method in a program that inputs a series of
 * pairs of integers.
 */
