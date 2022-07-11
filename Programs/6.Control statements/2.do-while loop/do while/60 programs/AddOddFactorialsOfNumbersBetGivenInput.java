import java.io.*;
class AddOddFactorialsOfNumbersBetGivenInput
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,fact,sum;
			System.out.println("number=");
			n=Integer.parseInt(t.readLine());
			i=1;
			fact=1;
			sum=0;
			if(n%2==0)
				n=n-1;
			do
			{
				if(i%2!=0)
				{
					fact=fact*i;
					sum=sum+fact;
				}	
				else 
					fact=fact*i;	
				i++;
				System.out.println(sum);	
			}
			while(i<=n);
			//System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}