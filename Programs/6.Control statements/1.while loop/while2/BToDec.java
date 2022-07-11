import java.io.*;
class BToDec
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("binary number");
			String bin=t.readLine();
			int len=bin.length();
			int i=1;
			int d=1;
			while(i<len)
			{
				if(bin.charAt(i)==48)
					d=d*2+0;
				else if(bin.charAt(i)==49)
					d=d*2+1;
				i++;
			}
			System.out.println(d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}