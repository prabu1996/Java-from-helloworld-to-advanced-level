class TestThrow2
{
	public static void method() throws FileNotFoundException
	{

	}
	public static void main(String arg[])
	{
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}
}