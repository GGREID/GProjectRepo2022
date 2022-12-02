package methods;

public class MethodsExample2 {

	public static void main(String[] args) 
	{
		public static void p(String s)
		{
		System.out.printf(s);
		}
		public static void skip(int noRows)
		{
		for(int i = 0; i < noRows; i++)
		{
		System.out.println();
		}
		public class MyVal
		{
		public static Scanner key = new Scanner(System.in);
		public static int validInt(String msg, int min, int max)
		{
		int num = 0;
		boolean ok;
		do
		{
		try
		{
		ok = true;
		My.p(msg);
		num = key.nextInt();
		key.nextLine();
		if(num < min  || num > max)
		{
		ok = false;
		My.p(String.format("\n\tError: Range is %2d - %2d.  Please re-
		enter.", min, max));
		}
		}
		catch(InputMismatchException e)
		{
		My.p("\n\tError:  Illegal character(s) 
		in input - Please re-enter.");
		key.nextLine();
		ok = false;
		}
		}while(!ok);
		return num;
		}
		}
		package methods;
		import java.util.Scanner;
		import general.*;
		public class TestGeneral {
		public static void main(String[] args)
		{
		Scanner key = new Scanner(System.in);
		int no1 = 0;
		//My.p("\n\n\tHello!!!");
		//My.skip(30);
		//My.p("\tHello!!!");
		no1 = MyVal.validInt("\n\n\tPlease enter a number:  ", 1, 
		10);
		no1 = MyVal.validInt("\n\n\tPlease enter exam mark:  ", 
		0, 100);
		no1 = MyVal.validInt("\n\n\tPlease enter a month:  ", 1, 
		12);
		}
		package methods;
		public class Example
		{
		public static void main(String[] args)
		{
		int no1 = 10, no2 = 20, sum = 0;
		double s1 = 6.0, s2 = 8.0;
		print();
		print("Teresa");
		System.out.print(print2());
		System.out.print(print2("Teresa"));
		System.out.print(print2("Joe"));
		System.out.print(print2("Pat"));
		System.out.print(print2("Kate"));
		//sum = ;
		System.out.print("\n\tSum:  " + add(no1, no2));
		System.out.print("\n\tHyp:  " + hyp(3.0, 4.0));
		System.out.print("\n\tHyp:  " + hyp(s1, s2));
		}
		public static double hyp(double side1, double side2)
		{
		//return Math.sqrt(side1 * side1 + side2 * side2);
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 
		2));
		}
		public static int add(int no1, int no2)
		{
		return no1 + no2;
		}
		//Example 1 - no parameters, no return
		public static void print()
		{
		System.out.print("\n\tHello!!!");
		}
		//Example 2 - parameters, no return
		public static void print(String name)
		{
		System.out.printf("\n\tHello %s!!!", name);
		}
		//Example 3 - no parameters, return
		public static String print2()
		{
		return "\n\tWelcome to methods!!!";
		}
		//Example 4 - parameters, return
		public static String print2(String name)
		{
		return "\n\tHello " + name + "...Welcome to methods!!!";
		}

}
