import java.io.*;
class Test1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n;
			System.out.println("No of families in a street=Array size");
			n=Integer.parseInt(t.readLine());
			int[] a=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("no of persons in a["+i+"]");
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				System.out.println("a["+i+"]="+a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}