import java.io.*;
class PrintOddNaturalNumbersInReverseOrder
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("enter n value");
			n=Integer.parseInt(t.readLine());
			if(n%2==0)
				n=n-1;
			for(i=n; i>=1; i=i-2)
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