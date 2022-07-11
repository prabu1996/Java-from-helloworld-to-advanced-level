import java.io.*;
class PrintMultiplicationTable
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,m;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=1;
			do
			{
				m=n*i;
				System.out.println(n+"x"+i+"="+m);
				i++;
			}
			while(i<=20);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}