import java.io.*;
class OctalToDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int dec,len,i;
			System.out.println("input octal number");
			n=t.readLine();
			len=n.length();
			dec=0;
			for(i=0;i<len;i++)
			{
				dec=dec*8+Character.getNumericValue(n.charAt(i));
				
			}
			System.out.println(dec);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
