import java.io.*;
class AddSquareOfNumbersBetGivenInput
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
			i=1;
			m=0;
			do
			{
				m=m+Math.pow(i,2);
				i++;
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