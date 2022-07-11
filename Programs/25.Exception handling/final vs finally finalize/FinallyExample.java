class FinallyExample
{
	public static void main(String arg[])
	{
		try
		{
			System.out.println("Inside try block");
			int data=26/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}s
		finally
		{
			System.out.println("Fianlly block is always executed");
		}
		System.out.println("Rest of the code");
	}
}