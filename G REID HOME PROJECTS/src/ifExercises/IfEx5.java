package ifExercises;
import java.util.*;
public class IfEx5 
{

		public static void main(String[] args) 
		{
				//Write a program that prompts an employee for hourly rate of pay and hours worked. 
				//Compute the gross pay (hours times rate), tax and net pay (gross minus tax). 
				//Tax is computed as a percentage of gross pay based on the following:
				//Gross Pay						Tax %
				//Up to and including £300	 	 10
				//£300.01 and up				 12

				//Modify the above using the following tax percentage ranges:
				//Gross Pay			Tax %
				//£0 to £300			 10
				//£300.01 to £400.00	 12
				//£400.01 to £500.00	 15
				//£500.01 and over		 20

				Scanner key = new Scanner(System.in);
				
				double hourlyRate = 0.0, hrsWorked = 0.0;
				double grossPay = 0.0, tax = 0.0, netPay = 0.0;
				//double taxRate = 0.0;
				char pound = 156;

				//Enter hourly rate and hours worked
				System.out.print("\n\n\tPlease enter your hourly rate: £");
				hourlyRate = key.nextDouble() ;


				System.out.print("\n\n\tPlease enter hours worked: ");
				hrsWorked = key.nextDouble() ;

				//Calculate gross pay, net pay and tax
				grossPay = hourlyRate * hrsWorked;

				/////////////////
		if 
		(grossPay > 500.0)
					tax = grossPay * 0.2;
		else if 
		(grossPay > 400.0)
					tax = grossPay * 0.15;
		else if 
		(grossPay > 300.0)
					tax = grossPay * 0.12;
		else
					tax = grossPay * 0.1;

		/////////////////
		//Alternate if statement
		//if (grossPay > 500.0)
				//	taxRate = 20;
				//else if (grossPay > 400.0)
				//	taxRate = 15;
				//else if (grossPay > 300.0)
				//	taxRate = 12;
				//else
				//	taxRate = 10;

				//tax = grossPay * taxRate /100;

				netPay = grossPay - tax;

				//Output wages
				System.out.printf("\n\n\tGross Pay:   £%6.2f", grossPay);
				System.out.printf("\n\n\tTax Payable: £%6.2f", tax);
				System.out.printf("\n\n\tNet Pay:     £%6.2f", netPay);
		}
}

