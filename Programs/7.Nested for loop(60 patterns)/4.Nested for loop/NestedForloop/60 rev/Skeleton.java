import java.io.*;
class Skeleton
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}