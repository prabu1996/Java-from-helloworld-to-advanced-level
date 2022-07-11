import java.io.*;
class AddFactorialsOfAllOddNumbersBetGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,fact,sum;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			sum=0;
			fact=1;
			if(n%2==0)
				n--;
			for(i=1; i<=n; i++)
			{
				if(i%2!=0)
					sum+=(fact*=i);
				else 
					fact=fact*i;
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