/*
 * Write a Java program that asks the user to input two numbers. Handle the possible 
 * exception that 
 * may occur if the user enters a non-numeric value, such as a string, instead of a number.
 */
package coustomException.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NonNumericExcpetion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			try 
			{
				System.out.println("Enter two number: ");
				int size = sc.nextInt();
				int size1 = sc.nextInt();
				System.out.println(size/size1);
				
			} 
			catch (ArithmeticException e) 
			{
				System.out.println(e);
			}
			catch (InputMismatchException e1) 
			{
				System.out.println(e1);
			}
		}
	}

}

