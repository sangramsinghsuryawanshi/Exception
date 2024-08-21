/*
 * Write a Java program that reads a array of integers from the user 
 * and throws an exception if any of the numbers are positive.
 */
package coustomException.com;

import java.util.Scanner;
class PositiveNumerException extends Exception
{
	PositiveNumerException(String m)
	{
		super(m);
	}
}
public class CheckNumContainsPosi {

	public void checkPositive(int a[]) throws Exception
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				throw new PositiveNumerException("The numbers contains positive numbers: "+a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		CheckNumContainsPosi  c = new CheckNumContainsPosi();
		try 
		{
			c.checkPositive(a);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
