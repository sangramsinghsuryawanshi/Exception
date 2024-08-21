/*
 * Write a Java program that accepts a string as input and 
 * attempts to parse it into an integer using the Integer.
 * parseInt() method. Handle the NumberFormatException that may 
 * occur if the string cannot be parsed into an integer and 
 * display a custom error message indicating the invalid input.
 */

package exception.handling.practice.com;

import java.util.Scanner;

public class HandleNumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		try
		{
			int c= Integer.parseInt(s);
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Enter only integers value: "+e);
		}
		
	}

}
