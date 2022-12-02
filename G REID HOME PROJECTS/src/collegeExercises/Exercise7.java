package collegeExercises;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) 
	{
		/*A mobile phone contract allows the user 250 minutes and 500 text messages a month.  
		 * After the allowance has been used the rates charged are £0.25 per minute and £0.15 per text.  
		 * Calculate the bill for a user who has used 412 minutes and 698 texts in a month.  
		Output the details in the form an itemised bill*/
		Scanner key = new Scanner(System.in);
		
		int minAllowance = 250;
		int txtAllowance = 500;
		int minsUsed =0;
		int txtsUsed =0;
		int extraMinsUsed =0;
		int extraTxtsUsed =0;
		double extraMinRate =0.25;
		double extraTxtRate =0.15;
		double totalBeforeAdditional=0;
		double totalIncExtraMins=0;
		double totalExtras=0;
		
		System.out.print("\n\tEnter total Minutes used: ");
		minsUsed =key.nextInt();
		
		extraMinsUsed =(minsUsed-minAllowance);
		System.out.print("\n\tMinutes over allowance: "+extraMinsUsed+" charged at an additional £0.25 per minute");
		
		System.out.print("\n\n\tEnter total Texts used: ");
		txtsUsed =key.nextInt();
		
		extraTxtsUsed =(txtsUsed-txtAllowance);
		System.out.print("\n\tTexts over allowance: "+extraTxtsUsed+" charged at an additional £0.15 per minute");
		totalExtras =((extraMinsUsed*.25)+(extraTxtsUsed*.15));
		
		System.out.print("\n\n\tYour additional costs will be £"+totalExtras);
		
	}

}
