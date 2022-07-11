import java.io.*;
class BinaryToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,dec,i,oct,j;
			System.out.println("input binary num");
			n=t.readLine();
			len=n.length();
			dec=0;
			oct=0;
			j=1;
			for(i=0;i<len;i++)
			{
				dec=dec*2+Character.getNumericValue(n.charAt(i));
			}
			System.out.println(dec);
			for(;dec>0;)
			{
				oct=(dec%8)*j+oct;
				dec=dec/8;
				j=j*10;
			}
			System.out.println(oct);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}