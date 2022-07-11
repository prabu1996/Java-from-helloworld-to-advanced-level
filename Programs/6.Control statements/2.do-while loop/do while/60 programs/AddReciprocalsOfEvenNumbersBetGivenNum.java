import java.io.*;
class AddReciprocalsOfEvenNumbersBetGivenNum
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n;
			double i,fact,reci,sum;
			System.out.println("nnumber");
			n=Integer.parseInt(t.readLine());
			i=2;
			fact=1;
			sum=0;
			if(n%2!=0)
				n-=1;
			do
			{
				if(i%2==0)
				{
					fact*=i;
					reci=1/fact;
					sum+=reci;
				}
				else 
					fact*=i;
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