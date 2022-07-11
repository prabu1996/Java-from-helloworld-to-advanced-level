import java.io.*;
class AddReciprocalsOfFactorialsOfAllNumbersBetGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i;
			double sum,fact;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			sum=0;
			fact=1;
			for(i=1; i<=n; i++)
			{
					fact=fact*i;
					sum+=(1/fact);
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