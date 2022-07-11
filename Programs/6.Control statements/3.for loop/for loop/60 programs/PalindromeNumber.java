import java.io.*;
class PalindromeNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int num,n,rev;
			System.out.println("number");
			num=Integer.parseInt(t.readLine());
			n=num;
			rev=0;
			for(;n>0;)
			{
				rev=rev*10+(n%10);
				n=n/10;	
			}
			System.out.println(rev);
			if(num==rev)
				System.out.println("Palindrome number");
			else 
				System.out.println("not an palindrome number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}