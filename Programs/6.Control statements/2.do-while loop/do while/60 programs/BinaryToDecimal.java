import java.io.*;
class BinaryToDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,dec,c,i;
			System.out.println("input binary num");
			n=t.readLine();
			len=n.length();
			dec=0;
			i=0;
			do
			{
				c=Character.getNumericValue(n.charAt(i));
				dec=dec*2+c;
				i++;	
			}
			while(i<len);
			System.out.println(dec);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}