import java.io.*;
class BubbleSort
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,x,y;
			System.out.println("Array size");	
			n=Integer.parseInt(t.readLine());
			int []a=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("value of a["+i+"]=");
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n-1;i++)
			{
				
				if(a[i+1]<a[i])
				{
					x=a[i];
					a[i]=a[i+1];
					a[i+1]=x;
				}
			}
			for(i=0;i<n-1;i++)
			{
				if(a[i+1]<a[i])
				{
					y=a[i];
					a[i]=a[i+1];
					a[i+1]=y;
				}
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