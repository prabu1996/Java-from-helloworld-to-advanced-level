import java.io.*;
class BinaryToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n,oct;
			int len,i,dec,r;
			System.out.println("binary number");
			n=t.readLine();
			len=n.length();
			i=0;
			oct="";
			dec=0;
			do
			{
				dec=dec*2+Character.getNumericValue(n.charAt(i));
				i++;	
			}
			while(i<len);
			System.out.println(dec);
			do
			{
				r=dec%8;	
				oct=String.valueOf(r)+oct;
				dec=dec/8;
			}
			while(dec>0);
			System.out.println(oct);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}