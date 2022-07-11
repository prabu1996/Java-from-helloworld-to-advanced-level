import java.io.*;
class pattern3
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
			for(int i=1;i<=n;i++)ss
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i);
					
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}