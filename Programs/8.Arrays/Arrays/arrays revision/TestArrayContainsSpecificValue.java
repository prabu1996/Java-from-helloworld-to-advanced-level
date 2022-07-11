import java.io.*;
class TestArrayContainsSpecificValue
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,x,count;
			System.out.println("no of families in our street");
			n=Integer.parseInt(t.readLine());
			int[] a=new int[n];
			count=0;
			for(i=0;i<n;i++)
			{
				System.out.println("enter value of a["+i+"]");
				a[i]=Integer.parseInt(t.readLine());
			}
			System.out.println("input specific value to check");
			x=Integer.parseInt(t.readLine());
			for(i=0;i<n;i++)
			{
				if(a[i]==x)
				{
					System.out.println("Array a contains value "+x);
				}
				else 
					count+=1;
			}
			if(count==n)
			{
				System.out.println("Array a not contains value "+x);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}