import java.io.*;
class CubeOfNumbersTill_n_
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,cube;
			double i;
			System.out.println("enter num");
			n=Integer.parseInt(t.readLine());
			for(i=1; i<=n; i++)
			{
				System.out.println(Math.pow(i,3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}