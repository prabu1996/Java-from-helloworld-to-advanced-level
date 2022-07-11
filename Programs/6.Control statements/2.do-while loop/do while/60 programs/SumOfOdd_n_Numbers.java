import java.io.*;
class SumOfOdd_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,score,sum;
			System.out.println("total innings played");
			n=Integer.parseInt(t.readLine());
			i=1;
			sum=0;
			do
			{
				System.out.println("runs scored in match"+i);
				score=Integer.parseInt(t.readLine());
				if(score%2!=0)
					sum=sum+score;
				i++;		
			}
			while(i<=n);
			System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}