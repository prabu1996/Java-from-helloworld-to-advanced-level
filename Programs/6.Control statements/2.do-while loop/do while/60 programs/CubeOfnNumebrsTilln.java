import java.io.*;
class CubeOfnNumebrsTilln
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			double cube;
			System.out.println("enter number");
			n=Integer.parseInt(t.readLine());
			cube=0;
			i=1;
			do
			{
				cube=Math.pow(i,3);
				System.out.println(cube);
				//cube=cube+Math.pow(i,3);
				i++;
			}
			while(i<=n);
			//System.out.println(cube);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}