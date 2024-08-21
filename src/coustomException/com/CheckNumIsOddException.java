/*
 * 2. Write a Java program to create a method that takes an 
 * integer as a parameter and throws an exception if the number is odd.
 */
package coustomException.com;

import java.util.Scanner;
class OddNumberException extends Exception
{
	OddNumberException(String msg)
	{
		super(msg);
	}
}
public class CheckNumIsOddException 
{

	public void oddOrNotException(int n) throws Exception
	{
			if(n%2!=0)
			{
				throw new OddNumberException ("The number is odd: "+n);
			}
			else
			{
				System.out.println("the number is even "+n);
			}
	}
public static void main(String[] args) 
{
			// TODO Auto-generated method stub
			CheckNumIsOddException n = new CheckNumIsOddException();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter given number: ");
			int n1 = sc.nextInt();
			try 
			{
				n.oddOrNotException(n1);
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}

}
