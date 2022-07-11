import java.io.*;
class DecimalToOctall
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,r;
			String oct,x;
			System.out.println("decimal number");
			n=Integer.parseInt(t.readLine());
			oct="";
			do
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
				oct=x+oct;
				n=n/16;
			}
			while(n>0);
			System.out.println(oct);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}