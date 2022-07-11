import java.io.*;
class PrimeNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,count;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			count=0;
			for(i=1; i<=n; i++)
			{
				if(n%i==0)
					count+=1;
			}
			if(count==2)
				System.out.println("Prime number");
			else 
				System.out.println("Non prime number");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}