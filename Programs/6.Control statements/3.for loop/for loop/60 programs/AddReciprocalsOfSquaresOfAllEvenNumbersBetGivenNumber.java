import java.io.*;
class AddReciprocalsOfSquaresOfAllEvenNumbersBetGivenNumber
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
			if(n%2!=0)
				n--;
			for(i=2; i<=n; i+=2)
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