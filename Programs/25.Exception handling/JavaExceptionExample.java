class JavaExceptionExample
{
	public static void main(String arg[])
	{
		try
		{
			int data=100/0;	
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");  
	}
}