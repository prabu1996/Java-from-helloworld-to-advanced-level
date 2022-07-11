import java.io.*;
class DecimalToHexadecimal1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("number");
			int n=Integer.parseInt(t.readLine());
			int i=1;
			int h=0;
			while(n>0)
			{
				int r=n%16;
				if (n>0)
					h=(r*i)+h;
					n=n/16;
					i=i*10;
				
			}
			System.out.println(h);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}