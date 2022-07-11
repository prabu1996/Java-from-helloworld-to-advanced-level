import java.io.*;
class PrintNaturalNumbersInReverseOrder
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("enter n value");
			n=Integer.parseInt(t.readLine());
			for(i=n; i>=1; i--)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}