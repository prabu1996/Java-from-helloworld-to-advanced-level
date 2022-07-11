import java.io.*;
class prime
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("number");
			int num=Integer.parseInt(t.readLine());
			int i=1;
			int divisor=0;
			while(i<num+1)
			{
				if(num%i==0)
				{
					divisor+=1;
					i++;
				}
				else 
					i++;
			}
			if(divisor==2)
				System.out.println("prime number");
			else 
				System.out.println("non prime number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}