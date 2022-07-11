import java.io.*;
class M
{
	public void method() throws IOException
	{
		throw new IOException("Device error"); //checked exception
	}
}
class TestThrows2
{
	public static void main(String arg[])
	{
		try
		{
			M obj=new M();
			obj.method();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		System.out.println("Normal flow");	
	}
}