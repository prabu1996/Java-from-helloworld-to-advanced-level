import java.io.*;
class BiggestNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,big,i;
			System.out.println("array size");
			n=Integer.parseInt(t.readLine());
			int []a=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("value of a["+i+"]");
				a[i]=Integer.parseInt(t.readLine());
				System.out.println(a[i]);
			}
			big=a[0];
			for(i=1;i<n;i++)
			{
				if(a[i]>big)
					big=a[i];	
			}
			System.out.println("biggest num is"+big);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}