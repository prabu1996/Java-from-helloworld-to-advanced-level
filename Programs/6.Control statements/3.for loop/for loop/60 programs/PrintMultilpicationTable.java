import java.io.*;
class PrintMultilpicationTable
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("enter n value");
			n=Integer.parseInt(t.readLine());
			for(i=1; i<=n; i++)
			{
				System.out.println(i+"x"+n+"="+(i*n));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}