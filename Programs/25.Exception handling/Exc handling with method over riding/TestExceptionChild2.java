class Parent
{
	public void msg() throws ArithmeticException
	{
		System.out.println("Parent method");
	}	
}	
class TestExceptionChild2 extends Parent
{
	public void msg() throws Exception
	{
		System.out.println("Child method");	
	}
	public static void main(String arg[])
	{
		Parent obj=new Parent();
		try
		{
		obj.msg();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}