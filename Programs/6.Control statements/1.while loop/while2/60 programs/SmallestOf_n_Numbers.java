import java.io.*;
class SmallestOf_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i=2;
			System.out.println("n value");
			int n=Integer.parseInt(t.readLine());
			System.out.println("enter 1st value");
			int x=Integer.parseInt(t.readLine());
			int small=x;
			while(i<n+1)
			{	
				System.out.println("enter "+i +"value");
				int y=Integer.parseInt(t.readLine());
				if(y<small)
					small=y;
				i++;
			}
			System.out.println("smallest of given "+n+" numbers are "+small);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}