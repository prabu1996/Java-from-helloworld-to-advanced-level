import java.io.*;
class SumOfNaturalNumbersTill_n_
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,z;
			System.out.println("enter n value");
			n=Integer.parseInt(t.readLine());
			i=1;
			z=0;
			while(i<n+1)
			{
				z+=i;
				i++;
			}
			System.out.println(z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}