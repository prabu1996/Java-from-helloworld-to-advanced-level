import java.io.*;
class TestDecimalToBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter number");
			int n=Integer.parseInt(t.readLine());
			int i=1;
			int b=0;
			while(n>0)
			{
				int r=n%2;
				b=b+(r*i);
				i=i*10;
				n=n/2;	
			}
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}