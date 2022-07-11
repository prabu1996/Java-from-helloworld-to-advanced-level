import java.io.*;
class ex1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,sum,avg;
			System.out.println("Array size");
			n=Integer.parseInt(t.readLine());
			int []a=new int[n];
			sum=0;
			for(i=0;i<n;i++)
			{
				System.out.println("value of"+i);
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				sum=sum+a[i];
			}
			for(i=0;i<n;i++)
			{
				System.out.println("a["+i+"]="+a[i]);
			}
			avg=sum/n;
			System.out.println(sum);
			System.out.println(avg);
		}		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}