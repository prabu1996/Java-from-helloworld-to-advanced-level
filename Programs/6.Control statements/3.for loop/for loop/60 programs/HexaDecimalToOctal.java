import java.io.*;
class HexaDecimalToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,value,dec,i,j,oct;	
			char c;
			System.out.println("input hexadecimal number");
			n=t.readLine();
			len=n.length();
			dec=0;
			j=1;
			oct=0;
			for(i=0;i<len;i++)
			{
				c=n.charAt(i);
				if(c=='A')
					value=10;
				else if(c=='B')
					value=11;
				else if(c=='C')
					value=12;
				else if(c=='D')
					value=13;
				else if(c=='E')
					value=14;
				else if(c=='F')
					value=15;
				else 
					value=Character.getNumericValue(n.charAt(i));
				dec=dec*16+value;
			}
			System.out.println(dec);
			for(;dec>0;)
			{
				oct=oct+(dec%8)*j;
				j=j*10;
				dec=dec/8;
			}
			System.out.println(oct);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}