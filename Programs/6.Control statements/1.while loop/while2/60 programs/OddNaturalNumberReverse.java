import java.io.*;
class OddNaturalNumberReverse
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int number,i;
			System.out.println("enter number");
			number=Integer.parseInt(t.readLine());
			i=number;
			while (i>=1)
			{
				if (i%2!=0)
					System.out.println(i);
				i--;
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}