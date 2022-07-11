import java.io.*;
class FactorialOfAGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,fact;
			System.out.println("factorial req number");
			n=Integer.parseInt(t.readLine());
			fact=1;
			for(i=1; i<=n ;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}