import java.io.*;
class DecimalToBinary2
{
	public static void main(String arg[])
	{
		try 
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter number");
			int n=Integer.parseInt(t.readLine());
			int s=0;
			int i=1;
			while(n>0)
			{
				int r=n%2;
				s+=(r*i);
				n/=2;
				i*=10;
			}
			System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}