class TestThrowAndThrows
{
	public static void method() throws ArithmeticException
	{
		System.out.println("Inside the method()");
		throw new ArithmeticException("Throwing ArithmeticException");
	}
	public static void main(String arg[])
	{
		try
		{
			method();
		}
		catch(Exception e)
		{
			System.out.println("Caught in main() method");
		}
		System.out.println("Rest of the code");
	}
}