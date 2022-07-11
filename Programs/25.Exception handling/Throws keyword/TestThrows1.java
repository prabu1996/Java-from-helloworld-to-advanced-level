import java.io.IOException;
class TestThrows1
{
	public void m() throws IOException
	{
		throw new IOException("Device error");
	}
	public void n() throws IOException
	{
		m();
	}
	public void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	public static void main(String arg[])
	{
		TestThrows1 obj=new TestThrows1();
		obj.p();
	}
}