import java.io.*;
class ReverseAnArray
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,j,m;
			int[] a={10,20,30,40,50};
			n=a.length;
			int[] b=new int[n];
			m=n-1;
			for(i=0;i<n;i++)
			{
					b[i]=a[m];
					m--;
			}
			for(i=0;i<n;i++)
			{
				System.out.println(b[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}