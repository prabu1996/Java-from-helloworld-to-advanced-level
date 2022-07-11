import java.io.*;
class AdditionOfTwoSingleDimenArrays
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i;
			int[] a={10,20,30,40,50};
			int[] b={5,10,15,20,25};
			int n=a.length;
			int[] c=new int[n];
			for(i=0;i<n;i++)
			{
				c[i]=a[i]+b[i];
				System.out.println("c["+i+"]="+c[i]);	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}