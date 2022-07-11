class NestedTryBlock1
{
	public static void main(String arg[])
	{
		try
		{
			try
			{
				System.out.println("Going to divide by zero");
				int b=39/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int[] a=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("Other statements");
		}
		catch(Exception e)
		{
			System.out.println("handled the exception by parent catch block(outer catch)");	
		}
		System.out.println("Normal flow");
	}
}