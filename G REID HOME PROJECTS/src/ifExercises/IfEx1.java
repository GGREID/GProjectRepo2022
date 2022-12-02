package ifExercises;

import java.util.Scanner;

public class IfEx1 
{

	public static void main(String[] args) 
	{
		//Write a program that prompts the user for a Current account balance and a Savings 
				//account balance. Display the message "Current account balance is low" if the 
				//current account balance is less than £10. Display the Message "Savings Account 
				//Balance is low" if the Savings Account balance is less than £100.

				//Modify the program above to display an additional message, "Both accounts 
				//are dangerously low" if both fall below the specified limits.

				Scanner key = new Scanner(System.in);
				

				double currBal = 0.0, savBal = 0.0;

				System.out.print("\n\tPlease enter your current account balance:  ");
				currBal = key.nextDouble() ;
				
				System.out.print("\n\tPlease enter your savings account balance:  ");
				savBal = key.nextDouble() ;

				
				if (currBal < 10.0 && savBal < 100.0)
					System.out.print("\n\tBoth accounts are dangerously low");
				else
				{	
					if (currBal < 10.0)
						System.out.print("\n\tCurrent account balance is low");

					if (savBal < 100.0)
						System.out.print("\n\tSavings account balance is low");
				}

	}
}