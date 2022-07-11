import java.io.*;
class SumOfDigitsOfANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int i,len,sum;
			System.out.println("number");
			n=t.readLine();
			len=n.length();
			i=0;
			sum=0;
			do
			{
				sum=sum+Character.getNumericValue(n.charAt(i));
				i++;
			}
			while(i<len);
			System.out.println(sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}