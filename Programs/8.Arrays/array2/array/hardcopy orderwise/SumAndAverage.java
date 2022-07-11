import java.lang.*;
class SumAndAverage
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,sum;
			System.out.println("no of families in street a");
			n=Integer.parseInt(t.readLine());
			int[] a=new int[n];
			sum=0;
			for(i=0;i<n;i++)
			{
				System.out.println("input size of family "+i);
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				sum=sum+a[i];
			}
			avg=sum/n;
			System.out.println(sum);
			System.out.println(avg);
		}
	}
}