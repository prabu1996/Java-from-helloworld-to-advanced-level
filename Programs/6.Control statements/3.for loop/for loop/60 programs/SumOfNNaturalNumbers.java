import java.io.*;
class SumOfNNaturalNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,sum;
			System.out.println("enter n value");
			n=Integer.parseInt(t.readLine());
			sum=0;
			for(i=1; i<=n; i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}