import java.io.*;
class PalindromeNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int number,rev;
			System.out.println("number=");
			number=Integer.parseInt(t.readLine());
			rev=0;
			while(number>=1)
			{
				rev=((rev*10)+(number%10));
				number/=10;
			}
			System.out.println(number);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}