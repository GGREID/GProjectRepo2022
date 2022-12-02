package collegeExercises;

import java.util.Scanner;

public class exercise2 

{
	public static void main(String[] args) 
	{
		
		Scanner key =new Scanner(System.in);
		
		int currAge=0;
		int currYear=0;
		int futureYr=0;
		int futureAge=0; 
		int sum=0;
		
		currYear = key.nextInt();
		futureYr =(currAge+currYear);
		futureAge =futureYr-futureAge;
		
		 System.out.print("\n\tPlease enter your name: ");
		 
		 System.out.print("\n\n\tPlease enter your age: ");
		 
		 System.out.print("\n\n\tPlease enter the current year: ");
		 
		 System.out.print(futureYr);
		 
		 System.out.print(futureAge);
	
	}

	}


	


