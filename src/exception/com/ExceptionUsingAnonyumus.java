package exception.com;

public class ExceptionUsingAnonyumus {

	public static void main(String[] args)
	{
		new Thread()
		{
			@Override
			public void run() 
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("add: "+i);
				}
			}
		}.start();
	}
}
