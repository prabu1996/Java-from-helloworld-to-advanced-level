class TestThrow3
{
	public static void main(String arg[])
	{
		try
		{
			throw new UserDefinedException("This is user defined exception");
		}
		catch(UserDefinedException e)
		{
			System.out.println("Caught the exception");
		}
	}
}