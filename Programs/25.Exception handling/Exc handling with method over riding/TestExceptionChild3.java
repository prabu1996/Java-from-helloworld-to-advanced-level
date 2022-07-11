
class Parent
{
	public void msg() throws ArithmeticException
	{
		System.out.println("Parent method");
	}	
}	
class TestExceptionChild3 extends Parent
{
	public void msg() throws ArithmeticException
	{
		System.out.println("Child method");	
	}
	public static void main(String arg[])
	{
		Parent obj=new TestExceptionChild3();
		try
		{
		obj.msg();
		}
		catch(Exception e)
		{
		
		}
	}
}