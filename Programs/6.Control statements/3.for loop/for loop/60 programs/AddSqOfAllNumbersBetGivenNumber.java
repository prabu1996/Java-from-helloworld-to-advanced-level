import java.io.*;
class AddSqOfAllNumbersBetGivenNumber
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
			for(i=1; i<=n;i++)	
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