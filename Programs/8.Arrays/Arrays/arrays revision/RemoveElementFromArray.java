import java.io.*;
class RemoveElementFromArray
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int[] a={10,20,30,40,50};
			int i;
			int n=a.length;
			System.out.println("Index of element to be removed");
			int m=Integer.parseInt(t.readLine());
			for(i=m;i<n-1;i++)
			{
				a[i]=a[i+1];		
			}
			for(i=0;i<n-1;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}