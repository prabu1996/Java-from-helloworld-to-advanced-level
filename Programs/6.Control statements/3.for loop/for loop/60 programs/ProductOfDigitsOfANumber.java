import java.io.*;
class ProductOfDigitsOfANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String n;
			int len,i,product;
			System.out.println("number");
			n=t.readLine();
			len=n.length();
			product=1;
			for(i=0;i<len;i++)
			{
				product=product*Character.getNumericValue(n.charAt(i));
			}
			System.out.println(product);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}