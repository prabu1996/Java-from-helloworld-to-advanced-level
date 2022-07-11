import java.io.*;
class TestFibonacciSeries
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,a,b,k;
			System.out.println("enter n value");
			n=Integer.parseInt(t.readLine());
			a=0;
			b=1;
			k=0;
			System.out.print("0 1 ");
			while(k<n+1)
			{
				k=a+b;
				System.out.print(k+" ");
				a=b;
				b=k;	
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}