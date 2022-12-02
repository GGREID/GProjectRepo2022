package methods;
import general.My;
import general.myVal;
public class MethodsEx5 {

	public static void main(String[] args) {
	
		/*5. Modify  problem  4  to  form  the  square  out  of  whatever  character  is  contained  in 
		character  parameter  fillCharacter.    Thus,  if  is  side  is  5  and  fillCharacter  is  '#',  the 
		method prints:
		#####
		#####
		#####
		#####
		#####*/ 
		int size = 0;
		
		//Welcome message to user
		My.p("\n\t\tLETS PRINT A SQUARE\n");
		
		//Get a validated integer from user
		My.p("\n\tWhat size of square would you like?");
		size = myVal.validInt("\n\tPlease enter a number between 1 and 50: ", 1, 50);
		 
		//Have square printed
		printSquare(size);
	}
	
	//Method to print a square of asterisks
	private static void printSquare(int size)
	{
		//New line before printing square
		My.p("\n");
		
		for (int i = 0; i < size; i++)
		{
			//Print each row
			for (int j = 0; j < size; j++)
			{
				My.p(" *");
			}
			//Move to the next row of square
			My.p("\n");
		}


	}

}
