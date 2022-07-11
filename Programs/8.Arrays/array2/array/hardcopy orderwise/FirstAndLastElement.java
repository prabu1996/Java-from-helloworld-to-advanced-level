import java.io.*;
class FirstAndLastElement
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("Array size");
			n=Integer.parseInt(t.readLine());
			int []a=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("value of a["+i+"]=");
				a[i]=Integer.parseInt(t.readLine());
			}
			System.out.println("a[0]="+a[0]);
			System.out.println("a["+n-1+"]="+a[n-1]);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}