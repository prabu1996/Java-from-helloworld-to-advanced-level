import java.io.*;
class PalindromeNumber1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t = new DataInputStream(System.in);
			int num,number,rev;
			System.out.println("number");
			number=Integer.parseInt(t.readLine());
			num=number;
			rev=0;
			while(num>=1)
			{
				rev=(rev*10)+(num%10);
				num/=10;
			}
			if(number==rev)
				System.out.println("palindrome num");
			else 
				System.out.println("not an palindrome num");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}