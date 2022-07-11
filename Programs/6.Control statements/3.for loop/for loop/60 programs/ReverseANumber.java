import java.io.*;
class ReverseANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n,rev;
			int i,len;
			System.out.println("enter num");
			n=t.readLine();
			len=n.length();
			rev="";
			for(i=0; i<len; i++)
			{
				rev=Character.getNumericValue(n.charAt(i))+rev;
			}
			System.out.println(rev);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}