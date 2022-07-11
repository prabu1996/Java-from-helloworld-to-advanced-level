import java.io.*;
class FibonacciSeries
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,z;
			System.out.println("n=");
			n=Integer.parseInt(t.readLine());
			i=1;
			a=0;
			b=1;
			while(i<n+1)
			{
				
				i++;
			}
			System.out.println(a+","+b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}