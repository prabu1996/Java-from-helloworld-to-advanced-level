import java.io.*;
class BinaryToHexaDecimal1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter binary number");
			int bin=Integer.parseInt(t.readLine());
			String b=String.valueOf(bin);
			int len=b.length();
			int dec=0;
			int i=0;
			int d=0;
			//binary to decimal
			while(i<len)
			{
				if(b.charAt(i)==49)
					d=d*2+1;
				else if(b.charAt(i)==48)
					d=d*2;
				i++;
			}
			System.out.println(d);
			//decimal to hexadecimal
			int rem=0;
			String hex="";
			while(d>0)
			{	
				rem=d%16;
				if(rem==10)
					hex="A"+hex;
				else if(rem==11)
					hex="B"+hex;
				else if(rem==12)
					hex="C"+hex;
				else if(rem==13)
					hex="D"+hex;
				else if(rem==14)
					hex="E"+hex;
				else if(rem==15)
					hex="F"+hex;
				else 
					hex=String.valueOf(rem)+hex;
				d=d/16;

			}
			System.out.println(hex);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}