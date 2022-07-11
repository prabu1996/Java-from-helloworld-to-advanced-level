import java.io.*;
class AmstrongNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,i,num;
			double sum;
			System.out.println("number");
			n=t.readLine();
			num=Integer.parseInt(n);
			len=n.length();
			sum=0;
			for(i=0;i<len;i++)
			{
				sum+=Math.pow((Character.getNumericValue(n.charAt(i))),3);
			}
			if(num==sum)
				System.out.println("Amstrong number");
			else 
				System.out.println("Not an amstrong number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}