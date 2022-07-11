import java.io.*;
class AddReciprocalsOfSquaresOfAllNumbersBetGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			double sum,sq;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			sum=0;
			for(i=1; i<=n; i++)
			{
				sq=Math.pow(i,2);
				sum+=(1/sq);
				System.out.println(sum);
				
			}
			System.out.println(sum);
			
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}