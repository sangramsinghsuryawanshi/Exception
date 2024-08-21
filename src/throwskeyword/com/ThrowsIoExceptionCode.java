package throwskeyword.com;

import java.io.IOException;

public class ThrowsIoExceptionCode {

	public void m1() throws IOException
	{
		throw new IOException("IOExecption occurres..");
	}
	public void m2() throws IOException
	{
		m1();
	}
	public void m3() throws IOException
	{
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsIoExceptionCode e = new ThrowsIoExceptionCode();
		try 
		{
			e.m3();
		} catch (Exception e2) 
		{
			System.out.println(e2);
		}
	}

}
