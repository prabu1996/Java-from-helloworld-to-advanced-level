import java.io.*;
class Parent
{
	public void msg() throws Exception
	{
		System.out.println("Parent method");
	}
}
class TestEXceptionChild4 extends Parent
{
	public void msg() throws ArithmeticException
	{
		System.out.println("Child method");
	}
	public static void main(String arg[])
	{
		Parent obj=new TestEXceptionChild4();
		try
		{
			obj.msg();
		}
		catch(Exception e)
		{

		}	
	}
}