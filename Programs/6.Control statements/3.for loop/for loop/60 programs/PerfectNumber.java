import java.io.*;
class PerfectNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,sum;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			sum=0;
			for(i=1; i<n; i++)
			{
				if(n%i==0)
					sum+=i;
			}
			if(sum==n)
				System.out.println("Perfect number");
			else 
				System.out.println("Non-perfect number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}