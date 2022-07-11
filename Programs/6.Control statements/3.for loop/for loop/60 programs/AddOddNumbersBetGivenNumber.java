import java.io.*;
class AddOddNumbersBetGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,sum;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			sum=0;
			if(n%2==0)
				n=n-1;
			for(i=1; i<=n ;i+=2)
			{
				sum+=i;	
			}
			System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}