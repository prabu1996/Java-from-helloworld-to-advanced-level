import java.io.*;
class MultiTable
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int number,i,a;
			System.out.println("enter number");
			number=Integer.parseInt(t.readLine());
			//System.out.println(number)
			i=1;
			while (i<=16)
			{
				a=(number*i);
				System.out.println(number+"x"+i+"="+a);
				i++;
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}