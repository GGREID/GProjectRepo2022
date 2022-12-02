package methods;

import java.util.Scanner;

public class MethodsEx3 
{

	public static void main(String[] args) 
	{
			/*3. Write a program that inputs a series of integers and passes one at a time to a method even, 
		which uses the remainder (modulus) operator to determine whether an integer is even. 
		The method should take an integer argument and return true if the integer is even and 
		false otherwise.*/
		
		
		System.out.print("\n\tEnter number: ");
		
		Even();
	}
	private static void Even() {
		Scanner key = new Scanner(System.in);
		int number = key.nextInt();
		if (number % 2 == 0)
		System.out.print("\n\tTrue");
		else
			System.out.print("\n\tFalse");
	}

}
