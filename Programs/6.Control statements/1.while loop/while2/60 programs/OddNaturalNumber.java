import java.io.*;
class OddNaturalNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int number,i;
			System.out.println("enter number");
			number=Integer.parseInt(t.readLine());
			i=1;
			while (i<=number)
			{
				if (i%2!=0)
					System.out.println(i);
				i++;
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}