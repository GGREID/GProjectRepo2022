package homeProjectExercises;

import java.util.Scanner;

public class homeExercises1 

{
public static void main(String[] args) {

	Scanner key = new Scanner(System.in);
	int no1 = 0, no2 = 0, sum = 0;
	//Input
	System.out.print("\n\tPlease enter number 1:  ");
	no1 = key.nextInt();
	System.out.print("\n\tPlease enter number 2:  ");
	no2 = key.nextInt();
	//process
	sum = no1+ no2;
	//output
	System.out.print("\n\tSum:  " + sum);
	System.out.print("\n\t" + no1 + " + " + no2 + " = " + sum);
	}

	
	
	
}
