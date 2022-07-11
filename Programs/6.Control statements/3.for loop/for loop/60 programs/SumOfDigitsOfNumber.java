import java.io.*;
class SumOfDigitsOfNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int count,i;
			System.out.println("n value");
			n=t.readLine();
			count=0;
			for(i=0; i<n.length(); i++)
			{
				count+=Character.getNumericValue(n.charAt(i));
			}
			System.out.println(count);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}