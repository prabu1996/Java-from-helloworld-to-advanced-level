import java.io.*;
class FactorialOfAgivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=1;
			double m=n;
			do
			{
				m=m*i;
				i++;
			}
			while(i<n);
			System.out.println(m);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}