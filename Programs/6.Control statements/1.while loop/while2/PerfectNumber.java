import java.io.*;
class PerfectNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter number");
			int num=Integer.parseInt(t.readLine());
			int i=1;
			int count=0;
			while(i<num)
			{
				if(num%i==0)
				{
					count+=i;
					i++;
				}
				else 
					i++;
			}
			if(count==num)
				System.out.println("perfect number");
			else 
				System.out.println("non perfect number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}