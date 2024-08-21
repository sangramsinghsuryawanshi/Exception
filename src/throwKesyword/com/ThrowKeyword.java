package throwKesyword.com;

import java.util.Scanner;

public class ThrowKeyword {
	
	public void method1(int n1,int n2)
	{
		if(n1<=n2){
			{
				throw new ArithmeticException("Number is less than zero please enter number greater than zero.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int n1=sc.nextInt();
		int n2 =sc.nextInt();
		ThrowKeyword t = new ThrowKeyword();
		try 
		{
			t.method1(n1,n2);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
