class TestFinallyBlock1
{
	public static void main(String arg[])
	{
		try
		{
			int data=50/5;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block always executed");
		}
		System.out.println("Rest of the code");
	}
}