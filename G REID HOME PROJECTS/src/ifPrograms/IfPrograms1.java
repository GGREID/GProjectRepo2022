package ifPrograms;

import java.util.Scanner;

public class IfPrograms1 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		/* 1. a currAcc balance
		   2. a savAcc  balance*/
		 
		int currAcc = 0, savAcc =0;
		
		System.out.print("\n\n\tPlease enter current acc balance:  ");
		currAcc = key.nextInt();
		
		System.out.print("\n\n\tPlease enter savings acc balance:  ");
		savAcc = key.nextInt();
		
		
		
		/* 3. Display the message "Current account balance is low" if the current account balance is <£10
		if (currAcc < 10)*/
		{
		System.out.print("\n\n\tCurrent account balance is low");
		} 
		 /*4. Display the Message "Savings Account Balance is low" if the Savings Account balance is <£100
		 if (savAcc < 10)*/
		{
		System.out.print("\n\n\tSavings account balance is low");
		}
		/*Modify the program above to display an additional message, 
		"Both accounts are dangerously low" if both fall below the specified limits.if (currAcc < 10 && savAcc <100)*/
		
	}

}
