import java.io.*;
class HexaDecimalToBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,i,value,dec,j,bin;
			char c;
			System.out.println("input hexadecimal");
			n=t.readLine();
			len=n.length();
			dec=0;
			bin=0;
			j=1;
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
			for(;dec>0;)
			{
				bin=(dec%2)*j+bin;
				j=j*10;
				dec=dec/2;
				System.out.println(bin);
			}
			System.out.println(bin);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
