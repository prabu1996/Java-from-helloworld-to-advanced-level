import java.io.*;
class SumOfOdd_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,runs,i,sum;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
			sum=0;
			for(i=1;i<=n;i++)
			{
				System.out.println("enter innings"+i+"runs");
				runs=Integer.parseInt(t.readLine());
				if(runs%2!=0)
					sum+=runs;
			}
			System.out.println(sum);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}