package nested.tryBlock;

public class NestedUnderNested {

	public static void main(String[] args) {
		try
		{
			System.out.println("Inner try block..");
			try
			{
				System.out.println("Try block 1: ");
				try
				{
					int a1[]= {1,2,3,4,5};
					System.out.println("Try block 1 inner block: "+a1[a1.length]);
				}
				catch(Exception e)
				{
					System.out.println("Try block 1 inner block: "+e);
				}
			}
			catch(Exception e)
			{
				System.out.println("Try block 2: "+e);
			}
			
			try
			{
				System.out.println("Try block 3: ");
				String name="ABC";
				int n=Integer.parseInt(name);
				try
				{
					System.out.println("Try block 3 inner block: "+n);
				}
				catch(Exception e)
				{
					System.out.println("Try block 3 inner block: "+e);
				}
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
