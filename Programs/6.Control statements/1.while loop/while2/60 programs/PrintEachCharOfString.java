import java.io.*;
class PrintEachCharOfString
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String string;
			char b;
			int Length,a;
			System.out.println("enter your string");
			string=t.readLine();
			Length=string.length();
			System.out.println(Length);
			a=0;
			while (a<Length)
			{
				b=string.charAt(a);
				a++;
				System.out.println(b);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}