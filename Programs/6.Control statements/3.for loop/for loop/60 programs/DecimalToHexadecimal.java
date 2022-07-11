import java.io.*;
class DecimalToHexadecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,r;
			String x,hex;
			System.out.println("decimal num");
			n=Integer.parseInt(t.readLine());
			hex="";
			for(;n>0;)
			{
				r=n%16;
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
				n=n/16;
			}
			System.out.println(hex);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}