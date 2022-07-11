import java.io.*;
class TestAdamNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter number");
			int number=Integer.parseInt(t.readLine());
			int rev=0;
			int i=1;
			int num=number;
			int rem1=0;
			int rev1=0;
			while(num>=1)
			{
				int rem=num%10;
				rev=(rev*10)+(rem);
				num/=10;
			}
			int numbersq=number*number;
			int revsq=(rev*rev);
			int x=revsq;
			while(x>=1)
			{
				rem1=x%10;
				rev1=(rev1*10)+(rem1);
				x/=10;
			}
			if (rev1==numbersq)
				System.out.println("adam number");
			else 
				System.out.println("non adam number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}