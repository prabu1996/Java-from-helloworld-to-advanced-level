import java.io.*;
class PrintNumbersFromMtenToMone
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			//System.out.println("type A");
			String a=t.readLine();
			if(a=="A")
			{
				int i=-10;
				do
				{
					System.out.println(i);
					i++;
				}
				while(i<0);
			}
			else 
				System.out.println("error boy");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}