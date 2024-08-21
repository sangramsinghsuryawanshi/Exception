/*
 * Write a Java program that asks the user to input two numbers. 
 * Handle the possible exception that may occur if the
 *  user enters a non-numeric value, such as a string, instead of a number.
 */

package exception.handling.practice.com;

import java.util.Scanner;

public class HandleThePossibleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter String 1: ");
			String s = sc.nextLine();
			System.out.println("Enter String 2: ");
			String s1 = sc.nextLine();
			int c=Integer.parseInt(s);
			int c1=Integer.parseInt(s1);
			System.out.println("Division: "+(c/c1));
		}
		catch(Exception e)
		{
			System.out.println("enter valid numberL "+e);
		}
	}

}
