/*
 * Implement a method called calculateFactorial that takes an 
 * integer as a parameter and calculates its factorial. Handle 
 * the exception that may occur if the input number is negative 
 * or exceeds a predefined limit.
 */
package coustomException.com;

import java.util.Scanner;
class NegativeInputAndLimiExceedException extends Exception
{
	NegativeInputAndLimiExceedException(String msg)
	{
		super(msg);
	}
}
public class CalculateFactorial {

	public void factorialException() throws Exception
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter given number: ");
			int n = sc.nextInt();
			System.out.println("Enter limit of number: ");
			int n1 = sc.nextInt();
			int fact=1;
			if(n>0 || n1>100)
			{
				throw new NegativeInputAndLimiExceedException("The input number is negative And exceeds a predefined limit:\n "+n+" <--value limit--> "+n1);
			}
			else
			{
				for(int i=1;i<=n;i++)
				{
					fact*=i;
				}
			}
			System.out.println("Factorial of given number is: "+fact);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CalculateFactorial n = new CalculateFactorial();
			try 
			{
				n.factorialException();
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}

	}
