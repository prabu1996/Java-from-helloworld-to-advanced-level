import java.io.*;
class DecimalToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,r;
			String s,b;
			System.out.println("decimal number");
			n=Integer.parseInt(t.readLine());
			b="";
			do
			{
				r=n%8;
				s=String.valueOf(r);
				b=s+b;
				n=n/8;		
			}
			while(n>0);
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}