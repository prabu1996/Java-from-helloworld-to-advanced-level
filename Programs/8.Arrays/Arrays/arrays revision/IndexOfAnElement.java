import java.io.*;
class IndexOfAnElement
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("no of houses in street a ");
			int n=Integer.parseInt(t.readLine());
			int[] a=new int[n];
			int count=0;
			int i;
			for(i=0;i<n;i++)
			{
				System.out.println("size of house"+i);
				a[i]=Integer.parseInt(t.readLine());
			}
			// i want to know in which house exactly 10 peoples are there.
			System.out.println("count to check");
			int x=Integer.parseInt(t.readLine());
			for(i=0;i<n;i++)
			{
				if(a[i]==x)
				{
					System.out.println("Index of element"+x+"="+i);
				}
				else if(a[i]!=x)
					count+=1;
			}
			if(count==n)
				System.out.println("no families have exactly"+x+" peoples");
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}