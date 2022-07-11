import java.io.*;
class SumOf_n_NumbersAndAverage
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,score,sum;
			double avg;
			System.out.println("total innings played");
			n=Integer.parseInt(t.readLine());
			i=1;
			sum=0;
			do
			{
				System.out.println("runs scored in match"+i);
				score=Integer.parseInt(t.readLine());
				sum=sum+score;
				avg=sum/i;
				i++;		
			}
			while(i<=n);
			System.out.println(sum+/navg);
			//System.out.println(sum);
			//System.out.println(avg);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}