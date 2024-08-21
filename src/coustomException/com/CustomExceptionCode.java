package coustomException.com;
class AgeValidException extends Exception
{
	AgeValidException(String msg)
	{
		super(msg);
	}
}
public class CustomExceptionCode 
{

	public void voting() throws AgeValidException
	{
		int age =19;
		if(age>18)
		{
			throw new AgeValidException("Age are valid"+age);
		}
		else
		{
			throw new AgeValidException("Age are not valid");
		}
	}
	public static void main(String[] args) {
		CustomExceptionCode e = new CustomExceptionCode();
		try 
		{
			e.voting();
		} catch (Exception e2) 
		{
			System.out.println(e2);
		}
	}

}