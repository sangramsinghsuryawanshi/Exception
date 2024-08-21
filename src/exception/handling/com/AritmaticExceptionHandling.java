package exception.handling.com;

import java.util.Scanner;

public class AritmaticExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		try
		{
			System.out.println("Additon: "+(a+b));
			System.out.println("substraction: "+(a-b));
			System.out.println("Exception: "+(a/0));
		}
		catch(Exception e)
		{
			System.out.println("Exception occurrs..."+e);
		}
		finally
		{
			System.out.println("Finaly block executed..");
		}
	}

}
