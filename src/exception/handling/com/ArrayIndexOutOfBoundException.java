package exception.handling.com;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		try{
			for(int i=0;i<a.length;i++) {
				a[i]=a[i+1];
			}
		}
		catch(Exception e) {
			System.out.println("ArrayIndexOutOfBoundException occurrs.."+e);
		}
	}

}
