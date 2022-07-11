import java.io.*;
class SumOf_n_NumbersAndAverage
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,sum,i,marks;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
			sum=0;
			for(i=1; i<=n; i++)
			{
				System.out.println("subject"+i+"marks=");
				marks=Integer.parseInt(t.readLine());
				sum+=marks;
			}
			System.out.println(sum);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}