import java.io.*;
class AddEvenNumbersBetGivenInput
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,m;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=2;
			m=0;
			if(n%2!=0)
				n=n-1;
			do
			{
				m=m+i;
				i+=2;
			}
			while(i<=n);
			System.out.println(m);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}