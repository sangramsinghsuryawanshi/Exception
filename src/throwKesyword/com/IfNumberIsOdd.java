/*
 * 2. Write a Java program to create a method that takes an integer as a 
 * parameter and throws an exception if the number is odd.
 */
package throwKesyword.com;

import java.util.Scanner;

public class IfNumberIsOdd {

	public void methodOdd(int n1)
	{
		if(n1%2!=0){
			{
				throw new ArithmeticException("You enterd odd number.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int n1=sc.nextInt();
		IfNumberIsOdd t = new IfNumberIsOdd();
		try 
		{
			t.methodOdd(n1);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
