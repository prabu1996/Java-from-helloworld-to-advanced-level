import java.io.*;
class PrintEvenNaturalNumbersTill_n_
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,z;
			System.out.println("input n=");
			n=Integer.parseInt(t.readLine());
			i=2;
			while(i<n+1)
			{
				if(i%2==0)
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