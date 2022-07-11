import java.io.*;
class AddReciprocalsOfNumbersBetGivenNum
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
			i=1;
			fact=1;
			sum=0;
			do
			{
				fact*=i;
				reci=1/fact;
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