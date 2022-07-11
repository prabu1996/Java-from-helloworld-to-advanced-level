import java.io.*;
class ReverseTheNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,i,z,b,c;
			System.out.println("n=");
			a=Integer.parseInt(t.readLine());
			c=1;
			while(c>=1)
			{
				b=a%10; 
				System.out.print(b);
				c=a/10;
				a=c;
					
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}