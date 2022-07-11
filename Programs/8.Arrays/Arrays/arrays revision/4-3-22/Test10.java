import java.io.*;
class Test10
{
	public static void main(String arg[])
	{
		int n,i;
		int[] a={10,20,30,40,50};
		n=a.length;
		int[] b={1,2,3,4,5};
		int[] c=new int[n];
		for(i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.println("c["+i+"]="+c[i]);
		}
	}
}