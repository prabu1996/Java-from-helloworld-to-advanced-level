import java.io.*;
class DecimalToBinary
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
				r=n%2;
				s=String.valueOf(r);
				b=s+b;
				n=n/2;		
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