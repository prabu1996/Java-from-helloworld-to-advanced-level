import java.io.*;
class AddSquareOfEvenNumbersBetGivenInput
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			double m;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=2;
			m=0;
			if(n%2!=0)
				n=n-1;
			do
			{
				m=m+Math.pow(i,2);
				i+=2;
				System.out.println(m);
			}
			while(i<=n);
			//System.out.println(m);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}