import java.io.*;
class OctalToHexaDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n,x,hex;
			int dec,len,i,j,r;
			System.out.println("input octal number");
			n=t.readLine();
			len=n.length();
			dec=0;
			j=1;
			hex="";
			for(i=0;i<len;i++)
			{
				dec=dec*8+Character.getNumericValue(n.charAt(i));
				
			}
			//System.out.println(dec);
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
