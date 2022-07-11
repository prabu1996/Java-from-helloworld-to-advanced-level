import java.io.*;
class PrintNaturalNumbersInReverseOrder
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=n;
			do
			{
				System.out.println(i);
				i--;
			}
			while(i>=1);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}