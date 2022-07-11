import java.io.*;
class SmallestNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,small;
			System.out.println("array size");
			n=Integer.parseInt(t.readLine());
			int []a=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("value of a["+i+"]=");
				a[i]=Integer.parseInt(t.readLine());
			}
			small=a[0];
			for(i=1;i<n;i++)
			{
				if(a[i]<small)
					small=a[i];
			}
			System.out.println("smallest num is"+small);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}