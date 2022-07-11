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
			len=n.length();
			num=Integer.parseInt(n);
			i=0;
			sum=0;
			do
			{
				sum=sum+Math.pow(Character.getNumericValue(n.charAt(i)),3);
				i++;
			}
			while(i<len);
			if(num==sum)
				System.out.println("Amstrong number");
			else 
				System.out.println("Not an Amstrong number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}