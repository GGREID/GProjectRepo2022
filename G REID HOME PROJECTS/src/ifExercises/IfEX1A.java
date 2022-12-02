package ifExercises;

import java.util.Scanner;

public class IfEX1A 
{

	public static void main(String[] args) 
	{
		/*Write a program that prompts the user for a Current account balance and a Savings 
		//account balance. Display the message "Current account balance is low" if the 
		//current account balance is less than £10. Display the Message "Savings Account 
		//Balance is low" if the Savings Account balance is less than £100.

		//Modify the program above to display an additional message, "Both accounts 
		//are dangerously low" if both fall below the specified limits.*/
		
		Scanner key = new Scanner(System.in);
		double CURRACC, SAVACC;
		System.out.print("ENTER CURRENT ACC BALANCE: ");
		CURRACC = key.nextDouble();
		System.out.print("ENTER SAVINGS ACC BALANCE: ");
		SAVACC = key.nextDouble();
		
		if(CURRACC<10)
		{
			System.out.print("\n\tCurrent account balance is low ");
		}
			
		if(SAVACC<100)
		{	
			System.out.print("\n\n\tSavings Account Balance is low ");
		}
		
		if(SAVACC<100 && CURRACC<10)
		{	
			System.out.print("\n\n\tBoth accounts are dangerously low ");
		}
		
	}

}


