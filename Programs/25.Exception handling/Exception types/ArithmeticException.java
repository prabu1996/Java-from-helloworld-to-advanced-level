
class ArithmeticException
{
	public static void main(String arg[])
	{
		try
		{
			int a=100/0;	
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Rest of the code");
		}
	}
}