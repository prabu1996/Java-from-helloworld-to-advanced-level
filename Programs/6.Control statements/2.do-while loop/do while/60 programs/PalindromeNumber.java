import java.io.*;
class PalindromeNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n,rev;
			int len,x,y,i;
			System.out.println("number");
			n=t.readLine();
			len=n.length();
			rev="";
			i=len-1;
			do
			{
				rev=rev+n.charAt(i);
				i--;
			}
			while(i>=0);
			x=Integer.parseInt(n);
			y=Integer.parseInt(rev);
			if(x==y)
				System.out.println("palindrome number");
			else 
				System.out.println("Not a palindrome number");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}