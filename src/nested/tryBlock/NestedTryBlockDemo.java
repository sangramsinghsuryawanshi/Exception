package nested.tryBlock;

public class NestedTryBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Inner try block..");
			try
			{
				int a=3/0;
				System.out.println(a);
			}
			catch(Exception e)
			{
				System.out.println("Try block 1: "+e);
			}
			try
			{
				int a1[]= {1,2,3,4,5};
				System.out.println("Try block 2: "+a1[a1.length]);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			String name="ABC";
			try
			{
				System.out.println("Try block 3: "+name);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Outter try block..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
