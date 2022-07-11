import java.io.*;
class AmstrongNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,a,b,i,d;
			double c;
			System.out.println("enter your number");
			a=Integer.parseInt(t.readLine());
			n=a;
			c=0;
			d=1;
			while(n>=1)
			{
				b=n%10;
				c+=Math.pow(b,3);
				d=(int) c;
				//System.out.println((int) c);
				n/=10;	
			}
			if (d==a)
				System.out.println(a+"is an amstrong number");
			else
				System.out.println(a+"is not an amstrong number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}