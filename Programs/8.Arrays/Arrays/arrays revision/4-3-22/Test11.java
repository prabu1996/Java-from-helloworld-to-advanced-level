//import java.io.*;
class Test11
{
	public static void main(String arg[])
	{
		int n,i,x,m;
		int[] a={10,20,30,40,50};
		n=a.length;
		m=n;
		int[] b=new int[n];
		x=0;
		for(i=n-1;i>=0;i--)
		{
			b[x]=a[n-1];
			x++;
			n--;
		}
		for(i=0;i<m;i++)
		{
			System.out.println("b["+i+"]="+b[i]);
		}
	}
}