package methods;

import java.util.Scanner;

import general.My;

public class MEx12 
{

	public static void main(String[] args) 
	{
		double calculateCharges;
		
		Scanner key = new Scanner(System.in);
		double hours1, hours2, hours3;
		double totalHrs = 0, totalCost = 0;
		double price1 = 0, price2 = 0, price3 = 0;
		
		My.p("\n\n\tCustomer 1  ");
		My.p("\n\tPlease enter hours parked:  ");
		hours1 = key.nextDouble();
		
		My.p("\n\n\tCustomer 2  ");
		My.p("\n\tPlease enter hours parked:  ");
		hours2 = key.nextDouble();
		
		My.p("\n\n\tCustomer 3  ");
		My.p("\n\tPlease enter hours parked:  ");
		hours3 = key.nextDouble();
		
		My.p(String.format("\n\n\t%5s %20s %14s", "Car", "Hours", "Charge"));
		price1 = calculateCharge(hours1);
		My.p(String.format("\n\t   1  %20.2f \t   £%5.2f", hours1, price1));
		totalCost += price1;
		totalHrs += hours1;
		
		price2 = calculateCharge(hours2);
		My.p(String.format("\n\t   2  %20.2f \t   £%5.2f", hours2, price2));
		totalCost += price2;
		totalHrs += hours2;
		
		price3 = calculateCharge(hours3);
		My.p(String.format("\n\t   3  %20.2f \t   £%5.2f", hours3, price3));
		totalCost += price3;
		totalHrs += hours3;
		
		My.p(String.format("\n\n\t Total%20.2f \t   £%5.2f", totalHrs, totalCost));

	}

	public static double calculateCharge(double hrs)
	{
		double temp = 0.0;
		
		if (hrs <= 3.0)
			return 2.0;
		else
		{
			hrs -= 3.0;
			if (hrs % 1 != 0)
				hrs += 1.0;
			
			temp = ((double)(int)hrs) * 0.5 + 2.00;
			
			if (temp > 10.00)
				return 10.0;
			else
				return temp; 
		}

	}

}
/*A parking garage charges £2.00 minimum fee to park for up to three hours. The garage 
charges an additional £0.50 per hour for each hour or part thereof in excess of the three 
hours. The maximum for any given 24-hour period is £10.00.  Assume that no car parks 
for longer than 24 hours at a time. Write a program that calculates and prints the parking 
charges for each of three customers who parked their car in this garage yesterday. You 
should enter the hours parked for each customer. Your program should print the results in 
a neat tabular format and should calculate and print the total of yesterday's receipts. 
The program should create a method calculateCharges to determine the charge for each 
customer. Your output should appear in the following format:
Car  Hours Charge
1 1.50    2.00
2 4.00    2.50
3         24.00    10.00
TOTAL      29.50      14.50*/