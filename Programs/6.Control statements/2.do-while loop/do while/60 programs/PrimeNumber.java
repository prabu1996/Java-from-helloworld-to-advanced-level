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
			i=1;
			count=0;
			do
			{
				if(n%i==0)
					count+=1;
				i++;
			}
			while(i<n+1);
			if(count==2)
				System.out.println(n+" is prime number");
			else 
				System.out.println(n+"is not a prime number");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
