class NestedTryBlock2
{
	public static void main(String arg[])
	{
		try
		{
			try
			{
				try
				{
					int[] a={10,20,30,40};
					System.out.println(a[10]);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Arithmetic exception");
					System.out.println("Inner try block 2");
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception");
				System.out.println("Inner try block 1");
			}
		}
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println(e4);
			System.out.println("Outer main try block");	
		}
		catch(Exception e5)
		{
			System.out.println(e5);
			System.out.println("Handled in main try block");
		}
	}
}