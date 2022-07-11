import java.io.*;
class SumOf_n_NumbersAndAverage
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter your n value");
			int n=Integer.parseInt(t.readLine());
			int i=2;
			int avg=0;
			System.out.println("number1=");
			int x=Integer.parseInt(t.readLine());
			int sum=x;
			while(i<n+1)
			{
				System.out.println("number"+i+"=");
				int y=Integer.parseInt(t.readLine());
				sum+=y;
				avg=sum/i;
				i++;	
			}
			System.out.println(sum+"\n"+avg);
			//System.out.println("sum of "+n+"number is "+sum);
			//System.out.println("avg of"+n+"number is "+avg);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}