import java.io.*;
class HexaDecimalToDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,i,value,dec,;
			char c;
			System.out.println("input hexadecimal");
			n=t.readLine();
			len=n.length();
			dec=0;
			for(i=0;i<len;i++)
			{
				c=n.charAt(i);
				if(c=='F')
					value=15;
				else if(c=='E')
					value=14;
				else if(c=='D')
					value=13;
				else if(c=='C')
					value=12;	
				else if(c=='B')
					value=11;
				else if(c=='A')
					value=10;
				else 
					value=Character.getNumericValue(n.charAt(i));
				dec=dec*16+value;
			}
			System.out.println(dec);
			
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
