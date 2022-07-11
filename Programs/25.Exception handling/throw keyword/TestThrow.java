class TestThrow
{
	public static void checkNum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("Num is negative,cannot calculate square");
		}
		else
		{
			System.out.println("Square of "+num+" is "+num*num);
		}		
	}
	public static void main(String arg[])
	{
		TestThrow obj=new TestThrow();
		obj.checkNum(-5);	
		System.out.println("Rest of the code");
	}
}