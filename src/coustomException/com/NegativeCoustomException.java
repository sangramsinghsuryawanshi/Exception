/*
 * Question 2:
Write a Java program that creates a custom exception class called NegativeInputException. 
The program should accept an integer as input and throw a NegativeInputException
 if the input is negative. Handle the exception and display a custom error 
 message indicating the negative input.
 */
package coustomException.com;

import java.util.Scanner;
class NegativeInputException extends Exception
{
	NegativeInputException(String msg)
	{
		super(msg);
	}
}
public class NegativeCoustomException 
{
	public void negativeException() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n = sc.nextInt();
		if(n<0)
		{
			throw new NegativeInputException("The input is negative."+n);
		}
		else
		{
			throw new NegativeInputException("The input is positive.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegativeCoustomException n = new NegativeCoustomException();
		try 
		{
			n.negativeException();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
