import java.io.*;
class CountNoOfDigitsInANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter your number");
			String num=t.readLine();
			int len=num.length();
			System.out.println(len);
			int i=1;
			do
				i++;
			while(i<len);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}