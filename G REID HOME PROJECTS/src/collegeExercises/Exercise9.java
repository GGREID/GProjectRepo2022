package collegeExercises;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) 
	{
		//Write a program which reads a person’s income for a year and his total tax allowance.  
		//Assuming all his taxable income is to be taxed at a standard rate of 20%, 
		//the program should print a tax bill, ie, total income, tax free allowance, tax paid and net pay
		double grossIncome =0;
		double	taxRate =0.8;
		double taxAmount =0;
		double taxFreePay =0;
		double netPay =0;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("\n\twhat is your gross pay: ");
		grossIncome =key.nextInt();
		
		taxFreePay =(grossIncome/taxRate);
		System.out.print("\n\tYour tax free allowance is: "+taxFreePay);
	}

}
