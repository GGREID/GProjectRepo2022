package methods;

public class MethodsExample1 
{

	public static return (String[] args) 
	{
		String name = "Pat", response = "";
		for (int i = 0; i < 5; i++)
		{
		print();
		}
		print("Teresa");
		print("John");
		print(name);
		response = print2();
		System.out.print(response);
		///or
		System.out.print(print2());
		System.out.print(print2("Teresa"));
		print("Teresa");
		System.out.print(print2());
		System.out.print("\n\tHyp:  " + hyp(3.0, 4.0));
		}
		public static double hyp(double side1, double side2)
		{
		//return Math.sqrt(side1 * side1 + side2 * side2);
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 
		2));
		}
		//Method 1 - no parameters, no return value
		public static void print()
		{
		System.out.print("\n\tHello");
		}
		//Method 2 - parameters, no return value
		public static void print(String name)
		{
		System.out.print("\n\tHello " + name);
		}
		//Method 3 - no parameters, return value
		public static String print2()
		{
		 return "\n\tWelcome to methods!";
		}
		//Method 4 - parameters, return value
		public static String print2(String name)
		{
		 return "\n\tWelcome to methods! " + name;
		}

	}


