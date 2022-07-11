import java.io.*;
class ReverseANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,rev,rem,a;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			rev=0;
			do
			{
				rem=n%10;
				//System.out.println("rem"+rem);
				rev*=10+rem;
				//System.out.println("rev"+rev);
				n/=10;	
			}
			while(n>0);
			System.out.println(rev);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
