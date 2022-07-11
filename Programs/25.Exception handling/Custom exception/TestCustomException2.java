class MyCustomException extends Exception
{
	
}
class TestCustomException2
{
	public static void main(String arg[])
	{
		try
		{
			throw new MyCustomException();
		}
		catch(MyCustomException e)	
		{
			System.out.println("Caught the Exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}
}