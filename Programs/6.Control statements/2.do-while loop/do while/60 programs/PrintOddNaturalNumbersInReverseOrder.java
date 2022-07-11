import java.io.*;
class PrintOddNaturalNumbersInReverseOrder
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
			if(n%2==0)
				i=n-1;
			do
			{
				System.out.println(i);
				i-=2;
			}
			while(i>=1);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}