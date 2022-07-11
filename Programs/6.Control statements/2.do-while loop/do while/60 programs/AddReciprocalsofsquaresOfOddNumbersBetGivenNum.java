import java.io.*;
class AddReciprocalsofsquaresOfOddNumbersBetGivenNum
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n;
			double i,reci,sum;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=1;
			sum=0;
			if(n%2==0)
				n-=1;
			do
			{
				reci=1/Math.pow(i,2);
				sum+=reci;
				i+=2;
				System.out.println(sum);
					
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