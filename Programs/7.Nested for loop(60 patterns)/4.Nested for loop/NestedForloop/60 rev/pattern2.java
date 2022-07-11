import java.io.*;
class pattern2
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
			for(int i=n;i>=1;i--)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(j);
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