import java.io.*;
class Reverse
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("input your number");
			int num=Integer.parseInt(t.readLine());
			int rev=0;
			while(num!=0)
			{
				rev=(rev*10)+(num%10);
				num/=10;	
			}
			System.out.println(rev);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}