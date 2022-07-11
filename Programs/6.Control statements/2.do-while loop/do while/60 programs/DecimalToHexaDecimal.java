import java.io.*;
class DecimalToHexaDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,r,a;
			String b;
			char c;
			System.out.println("decimal number");
			n=Integer.parseInt(t.readLine());
			b="";
			do
			{
				r=n%16;
				if(r==10)
					c='A';
				else if(r==11)
					c='B';
				else if(r==12)
					c='C';
				else if(r==13)
					c='D';
				else if(r==14)
					c='E';
				else if(r==15)
					c='F';
				else 
					c=char.ValueOf(r);
				b=c+b;
				n/=16;
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