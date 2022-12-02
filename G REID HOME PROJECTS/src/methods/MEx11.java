package methods;
import general.*;
public class MEx11 
{

	public static void main(String[] args) 
	{
		int average = 0;
		
		average = myVal.validInt("please enter average: ", 0, 100);
		
		System.out.println("score " + qualityPoints(average));
	}
	
	
	public static int qualityPoints(int average)
	{
		if (average >= 90)	
			return 4;
		else if (average >= 80)
			return 3;
		else if (average >= 70)
			return 2;
		else if (average >= 60)
			return 1;
		else 
			return 0;
		
	}

}
/*11. Write a method qualityPoints that inputs a student's average and returns a 4 if a student's 
average is 90 - 100, 3 if a student's average is 80 - 89, 2 if a student's average is 70 - 79, 1 
if a student's average is 60 - 69, and 0 if the average is lower than 60.*/