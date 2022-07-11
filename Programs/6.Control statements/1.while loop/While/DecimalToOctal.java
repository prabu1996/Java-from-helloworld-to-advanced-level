import java.io.*;
class DecimalToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("Decimal number");
			int n=Integer.parseInt(t.readLine());
			int o=0;
			int i=1;
			while(n>0)
			{
				int r=n%8;
				o=o+(r*i);
				n/=8;
				i*=10;		
			}
			System.out.println(o);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}