import java.io.*;
class ProductOfDigitsOfANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int pro,i,len;
			String n;
			System.out.println("enter number");
			n=(t.readLine());
			i=0;
			len=n.length();
			pro=1;
			do
			{
				pro=pro*Character.getNumericValue(n.charAt(i));
				i++;
			}
			while(i<len);
			System.out.println(pro);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}