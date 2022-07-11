import java.io.*;
class DecimalToBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,bin,i;
			System.out.println("enter decimal num");
			n=Integer.parseInt(t.readLine());
			bin=0;
			i=1;
			for(;n>0;)
			{
				bin=(n%2)*i+bin;
				n=n/2;
				i=i*10;
			}
			System.out.println(bin);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}