import java.io.*;
class CountNoOfDigitsInANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int count,i;
			System.out.println("n value");
			n=t.readLine();
			count=0;
			for(i=1; i<=n.length(); i++)
			{
				count=count+1;
			}
			System.out.println(count);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}