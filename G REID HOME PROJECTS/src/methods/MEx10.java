package methods;

import java.util.Scanner;

import general.My;

public class MEx10 {

	public static void main(String[] args) {
		
Scanner key = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		
		My.p("\n\n\tPlease enter first number: ");
		num1 = key.nextInt();
 
		My.p("\n\tPlease enter second number: ");
		num2 = key.nextInt();

		My.p("\n\n\tThe greatest common divisor of " + num1 + " & " + num2 + " is " + gcd(num1, num2));

	}
	
	public static int gcd (int no1, int no2)
	{
		int temp = 0; 

		for(int i=1; i <= no1 && i <= no2; i++)
		{
			if(no1 % i == 0 && no2 % i == 0 )
				temp = i;
		}

		return temp;
  
	

	}

}
/*10. The greatest common divisor (GCD) of two integers is the largest integer that evenly divides 
each of the numbers. Write a method gcd that returns the greatest common divisor of two 
integers.*/