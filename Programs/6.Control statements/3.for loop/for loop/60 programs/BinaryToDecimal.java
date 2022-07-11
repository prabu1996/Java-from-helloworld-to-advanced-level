import java.io.*;
class BinaryToDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,i,dec;
			System.out.println("input binary num");
			n=t.readLine();
			len=n.length();
			dec=0;
			for(i=0;i<len;i++)
			{
				dec=dec*2+Character.getNumericValue(n.charAt(i));
			}
			System.out.println(dec);
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}