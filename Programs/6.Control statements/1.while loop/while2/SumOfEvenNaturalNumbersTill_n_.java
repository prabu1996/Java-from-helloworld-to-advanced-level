import java.io.*;
class SumOfEvenNaturalNumbersTill_n_
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,z;
			System.out.println("n=");
			n=Integer.parseInt(t.readLine());
			i=2;
			z=0;
			while(i<n+1)
			{
				if(i%2==0)
				{
					z+=i;
				}
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