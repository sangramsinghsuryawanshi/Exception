/*
 * 3. Write a Java program that reads a array of integers from 
 * the user and throws an exception if any numbers are duplicates.

 */
package coustomException.com;

import java.util.Scanner;
class ArrayElementDuplicatException extends Exception
{
	ArrayElementDuplicatException(String msg)
	{
		super(msg);
	}
}
public class CheckDuplicateArrayAndThrowException 
{
	public void findDupicate(int a[]) throws Exception
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					throw new ArrayElementDuplicatException("Array numbers are found duplicates: "+a[i]);
				}
				else
				{
					System.out.println("Not found duplicate: "+a[i]);
				}
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
		CheckDuplicateArrayAndThrowException  c = new CheckDuplicateArrayAndThrowException();
		try 
		{
			c.findDupicate(a);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
