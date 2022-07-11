import java.io.*;
class DecimalToBinary1
{
	public static void main(String arg[])
	{
		try 
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter number");
			int num=Integer.parseInt(t.readLine());
			String b="";
			while(num>0)
			{
				int r=num%2;
				b=String.valueOf(r)+b;
				num/=2;
			}
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}