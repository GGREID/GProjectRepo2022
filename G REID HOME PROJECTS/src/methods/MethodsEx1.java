package methods;

import java.util.Scanner;

public class MethodsEx1 
{
	public static void main(String[] args) 
	{

		Scanner key = new Scanner(System.in);
		double x = 0, y = 0, z = 0, no1 = 0;
		for (int i = 0; i < 3; i++) 
		{
			System.out.print("\n\n\tEnter length of Triangle side 1:");
			x = key.nextDouble();
			System.out.print("\n\tEnter length of Triangle side 2:");
			y = key.nextDouble();

			z = hyp(x, y);

			System.out.print("\n\tWhen the length of side 1 = " + x + " and the length of side 2 = " + y);
			System.out.print("\n\n\tThe hypotenuse is: " + z);
		}
	}

	public static double hyp(double x, double y) {
		return Math.sqrt((x * x) + (y * y));
	}

}

/*
 * 1. Write and test a method hypotenuse that calculates the length of the
 * hypotenuse of a right angled triangle when the other two sides are given. Use
 * this method in a program to determine the length of the hypotenuse for each
 * of the triangle shown below. This method should take two double arguments and
 * return the hypotenuse as a double. Triangle Side 1 Side 2 1 3.0 4.0 2 5.0
 * 12.0 3 8.0 15.00
 */
