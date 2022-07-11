import java.io.*;
class Test2
{
	public static void main(String arg[])
	{
		int n,i,x;
		int[] a={10,9,8,7,6};
		n=a.length;
		x=3;
		for(i=2;i<n;i=i+2)
		{
			System.out.println("element"+x+" = "+a[i]);
			x=x+2;
		}
	}
}