import java.io.*;
class PrintOddNaturalNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=1;
			do
			{
				System.out.println(i);
				i+=2;
			}
			while(i<=n);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}