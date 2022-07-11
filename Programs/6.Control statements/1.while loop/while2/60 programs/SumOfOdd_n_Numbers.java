import java.io.*;
class SumOfOdd_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter your n value");
			int n=Integer.parseInt(t.readLine());
			int i=1;
			int sum=0;
			while(i<n+1)
			{
				System.out.println("enter number "+i+"=");
				int x=Integer.parseInt(t.readLine());
				if(x%2!=0)
				{
					sum+=x;	
				}
				i++;
			}
			System.out.println("sum of odd numbers= "+sum);		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}