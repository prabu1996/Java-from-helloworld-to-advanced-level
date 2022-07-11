import java.io.*;
class Prime
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("input your number");
			int num=Integer.parseInt(t.readLine());
			int i=2;
			while(i<num)
			{
				if (num%i!=0)
					i++;
			}
			if 
					System.out.println("prime number");
					break;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}