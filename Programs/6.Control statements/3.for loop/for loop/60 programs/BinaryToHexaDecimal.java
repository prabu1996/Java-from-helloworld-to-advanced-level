import java.io.*;
class BinaryToHexaDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n,hex,x;
			int len,i,dec,r;
			System.out.println("binary num");
			n=t.readLine();
			len=n.length();
			dec=0;
			hex="";
			for(i=0;i<len;i++)
			{
				dec=dec*2+Character.getNumericValue(n.charAt(i));
			}
			System.out.println(dec);
			for(;dec>0;)
			{
				r=dec%16;
				if(r==10)
					x="A";
				else if(r==11)
					x="B";
				else if(r==12)
					x="C";
				else if(r==13)
					x="D";
				else if(r==14)
					x="E";
				else if(r==15)
					x="F";
				else 
					x=String.valueOf(r);
				hex=x+hex;
				dec=dec/16;
			}
			System.out.println(hex);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}