import java.io.*;
class SumOfNNaturalNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,m;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=1;
			m=0;
			do
			{
				m+=i;
				i++;
			}
			while(i<=n);
			System.out.println("Sum of n natural numbers="+m);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}