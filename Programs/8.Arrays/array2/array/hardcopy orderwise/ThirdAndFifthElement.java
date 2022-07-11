import java.io.*;
class ThirdAndFifthElement
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
			for(i=2;i<5;i=i+2)
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