import java.io.*;
class AddSqOfAllEvenNumbersBetGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			double sum;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			sum=0;
			if(n%2!=0)
				n=n-1;
			for(i=2; i<=n; i+=2)
			{
				sum+=Math.pow(i,2);
			}
			System.out.println(sum);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}