package unconditionalLoops;

import java.util.Scanner;

public class UnconditionalLoopex2 {

	public static void main(String[] args) 

{
Scanner key = new Scanner(System.in);
int num = 0, sum = 0;
System.out.print("\n\t");
for (int i = 1; i <= 20; i++)
{
System.out.print("\t" + i);
}
System.out.print("\n-");
for (int i = 1; i <= 20; i++)
{
System.out.print("--------");
}
for (int i = 1; i <= 20; i++)
{
System.out.print("\n" + i + "\t" + "|");
for (int j = 1; j <= 20; j++)
{
System.out.print("\t" + i * j);
}
}
for (double i = 0.0; i < 5; i+=0.75)
{
System.out.print("\n\t" + i);
}
for (char i = 'A'; i <= 'Z'; i++)
{
System.out.print("\n\t" + i);
}
for (int i = 0; i < 5; i++)
{
System.out.print("\n\tPlease input number " + 
(i + 1) + ":  ");
num = key.nextInt();
//sum = sum + num;
sum += num;
}
System.out.print("\n\tSum:  " + sum);
}
}