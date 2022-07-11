import java.io.*;
class FibonacciSeries
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n1,n2,len,i,n3;
			System.out.println("1st number");
			n1=Integer.parseInt(t.readLine());
			System.out.println("2nd number");
			n2=Integer.parseInt(t.readLine());
			System.out.println("length of fibonacci series");
			len=Integer.parseInt(t.readLine());
			System.out.print(n1+" "+n2+" ");
			for(i=1;i<=len-2;i++)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(n3+" ");	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}