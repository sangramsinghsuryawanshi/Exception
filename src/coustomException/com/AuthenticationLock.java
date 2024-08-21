/*
 * 11. Authentication Lockout:
Implement a user authentication system that locks out users after a certain number of failed
 login attempts. If a user exceeds the maximum allowed login attempts, 
throw a custom exception AuthenticationLockoutException with a message indicating the lockout.
 */
package coustomException.com;

import java.util.Scanner;
class AuthenticationLockoutException extends Exception
{
	AuthenticationLockoutException(String m)
	{
		super(m);
	}
}
public class AuthenticationLock 
{
	public void lock() throws Exception
	{
			Scanner sc = new Scanner(System.in);
			int n1=3;
			int i=1;
			while(i<=n1)
			{
				System.out.println("********User Logon********");
				System.out.println("Enter your name: ");
				String s = sc.next();
				System.out.println("Enter your password: ");
				int n = sc.nextInt();
				if(n==1234)
				{
					System.out.println("You succesfully login..");
					break;
				}
				else if(n1<=i)
				{
					throw new AuthenticationLockoutException("A user exceeds the maximum allowed login attempts: "+n1);
				}
				System.out.println("You have only: "+(n1-i)+" attempt");
				i++;
			}
		}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			AuthenticationLock n = new AuthenticationLock();
			try 
			{
				n.lock();
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}

	}

