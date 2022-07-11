import java.io.*;
class DecimalToOctal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,oct;
			System.out.println("decimal number");
			n=Integer.parseInt(t.readLine());
			oct=0;
			i=1;
			for(;n>0;)
			{
				oct=(n%8)*i+oct;
				n=n/8;
				i=i*10;
			}
			System.out.println(oct);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
