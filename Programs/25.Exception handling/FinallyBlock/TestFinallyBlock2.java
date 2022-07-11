class TestFinallyBlock2
{
	public static void main(String arg[])
	{
		try
		{
			int data=50/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code");
	}
}