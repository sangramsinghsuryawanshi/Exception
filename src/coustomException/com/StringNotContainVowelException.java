/*
 * 4. Write a Java program to create a method that takes a string as 
 * input and throws an exception if the string does not contain vowels.

5. Write a Java program that reads a array of integers from the user and throws an exception if any of the numbers are positive.
 */
package coustomException.com;

import java.util.Scanner;
class VowelNotContainsException extends Exception
{
	VowelNotContainsException(String m)
	{
		super(m);
	}
}
public class StringNotContainVowelException {

	public void findVowel(String a) throws Exception {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != 'a' || a.charAt(i) != 'e' || a.charAt(i) != 'i' || a.charAt(i) != 'o'
					|| a.charAt(i) != 'u') 
			{
				throw new VowelNotContainsException("The string does not contain vowels: "+a);
			}
			else
			{
				System.out.println("The string contain vowels");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		StringNotContainVowelException c = new StringNotContainVowelException();
		try {
			c.findVowel(str);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
