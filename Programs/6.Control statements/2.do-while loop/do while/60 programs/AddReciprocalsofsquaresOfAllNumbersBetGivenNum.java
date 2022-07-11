import java.io.*;
class AddReciprocalsofsquaresOfAllNumbersBetGivenNum
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
			do
			{
				reci=1/Math.pow(i,2);
				sum+=reci;
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