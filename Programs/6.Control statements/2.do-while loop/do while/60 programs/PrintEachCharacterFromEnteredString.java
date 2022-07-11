import java.io.*;
class PrintEachCharacterFromEnteredString
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String a;
			int len,i;
			System.out.println("name?");
			a=t.readLine();
			len=a.length();
			i=0;
			do
			{
				System.out.println(a.charAt(i));
				i++;
			}
			while(i<len);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}