import java.io.*;
class FirstAndLastElement

{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			System.out.println("no of families in street a");
			n=Integer.parseInt(t.readLine());
			int[] a=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("input size of family "+i);
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				if(i==1)
				{
					a[i]=50;
				}
				System.out.println("a["+i+"]="+a[i]);
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}