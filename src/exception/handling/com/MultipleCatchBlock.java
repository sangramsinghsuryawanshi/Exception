package exception.handling.com;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try {
			String str="str";
			int a=Integer.parseInt(str);
			System.out.println(str);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Excepion is Found....."+e);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Excepion is Found....."+e);
		}
		catch(Exception e) 
		{
			System.out.println("Excepion is Found....."+e);
		}
		finally 
		{
			System.out.println("Finally Block Exucuted.....");
		}

	}

}
