package nested.tryBlock;

public class ExceptionPropagation {
	public void method1()
	{
		try
		{
			int a=3/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Method1 executed"+e);
		}
	}
	public void method2()
	{
		method1();
		System.out.println("Method2 executed..");
	}
	public void method3()
	{
		method2();
		System.out.println("Method3 executed..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation e = new ExceptionPropagation();
		e.method3();
	}

}
