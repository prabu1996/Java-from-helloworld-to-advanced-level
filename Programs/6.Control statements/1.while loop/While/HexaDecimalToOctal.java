import java.io.*;
class HexaDecimalToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter hexadecimal number");
			String x=t.readLine();
			int len =x.length();
			int i=0;
			int n,dec;
			dec=0;
			while(i<len)
			{
				char c=x.charAt(i);
				if(c=='A')
					n=10;
				else if(c=='B')
					n=11;
				else if(c=='C')
					n=12;
				else if (c=='D')
					n=13;
				else if(c=='E')
					n=14;
				else if(c=='F')
					n=15;
				else 
					n=Character.getNumericValue(c);
				dec=dec*16+n;
				i++;
			}
			int oct=0;
			int m=1;
			while(dec>0)
			{
				int rem=dec%8;
				oct=rem*m+oct;
				m=m*10;
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