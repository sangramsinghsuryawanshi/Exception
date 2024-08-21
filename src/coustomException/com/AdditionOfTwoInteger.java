/*
 * Write a Java program that throws a custom exception when 
 * the sum of two integers exceeds a certain threshold. 
 * The program should accept two integers as input and throw
 *  a ThresholdExceededException if their sum is greater than 100.
 *   Handle the exception and display an appropriate error message.
 */
package coustomException.com;

import java.util.Scanner;

class ThresholdExceededException extends Exception
{
	ThresholdExceededException(String msg)
	{
		super(msg);
	}
}
public class AdditionOfTwoInteger 
{
	public void addOfTwoInt() throws Exception
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two number: ");
			int n = sc.nextInt();
			int n1 = sc.nextInt();
			int result = n+n1;
			if(result>100)
			{
				throw new ThresholdExceededException("The sum is greater than 100 sum-->"+result);
			}
			else
			{
				System.out.println("The sum is less than 100"+result);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AdditionOfTwoInteger n = new AdditionOfTwoInteger();
			try 
			{
				n.addOfTwoInt();
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}

	}
