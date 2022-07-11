import java.io.*;
class Pattern1Copy
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}