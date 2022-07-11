import java.io.*;
class PrintOddNaturalNumbersTill_n_
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,z,i;
			System.out.println("input");
			n=Integer.parseInt(t.readLine());
			i=1;
			while(i<n+1)
			{
				if(i%2!=0)
				{
					z=i;
					System.out.println(z);
					i++;
				}
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}