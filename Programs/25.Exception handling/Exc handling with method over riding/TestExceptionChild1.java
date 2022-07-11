import java.io.*;
class Parent
{
	public void msg()
	{
		System.out.println("Parent method");
	}
}
class TestExceptionChild1 extends Parent
{
	public void msg() throws ArithmeticException
	{
		System.out.println("Child method");
	}
	public static void main(String arg[])
	{
		Parent obj=new TestExceptionChild1();
		obj.msg();
	}
}