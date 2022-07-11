import java.io.*;
class PrintNaturalNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("enter number");
			n=Integer.parseInt(t.readLine());
			i=1;
			do
			{
				System.out.println(i);
				//System.out.print(i);
				i++;
			}
			while(i<n+1);
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}